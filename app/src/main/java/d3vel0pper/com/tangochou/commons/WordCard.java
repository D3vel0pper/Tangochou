package d3vel0pper.com.tangochou.commons;

/**
 * Created by taka-dhu on 2015/12/12.
 */
public class WordCard {
    /**
     * face -> user can register this by editing EditText
     * back -> user can register this by editing EditText
     * recently_result -> user's recently result of this card. 0->no data 1->corrected 2->miss
     *      when update this, always put in [0]. MostRecentlyUpdate = recently_result[0]
     */
    private String face;
    private String back;
    private char recently_result[];

    public WordCard(){
        recently_result = new char[5];
        for(int i = 0;i < 5;i++){
            recently_result[i] = 0;
        }
    }

    public void SetFace(String str){
        this.face = str;
    }

    public String GetFace(){
        return this.face;
    }

    public void SetBack(String str){
        this.back = str;
    }

    public String GetBack(){
        return this.back;
    }

    public void SetResults(char c,int place){
        /**
         * this function gets data from database and puts those data to array
         * place -> where data put.
         * c -> data 0 or 1 or 2.
         */
        this.recently_result[place] = c;
    }

    public char[] GetResults(){
        return this.recently_result;
    }

    public void SetUserResult(char res){
        /**
         * res = 0 -> corrected
         * res = 1 -> miss
         */
        if(res == 0){
            this.recently_result[0]++;
        } else {
            this.recently_result[0] = 2;
        }
        for(int i = 4;i > 0;i--){
            this.recently_result[i] = this.recently_result[i-1];
        }
    }

}
