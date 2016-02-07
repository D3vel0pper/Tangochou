package d3vel0pper.com.tangochou.commons;

/**
 * Created by taka-dhu on 2016/02/07.
 */
public class ListData {
    private String text1 = "";
    private String text2 = "";

    public ListData(String data1,String data2){
        setText1(data1);
        setText2(data2);
    }
    public String getText1(){
        return this.text1;
    }
    public void setText1(String data){
        this.text1 = data;
    }
    public String getText2(){
        return this.text2;
    }
    public void setText2(String data){
        this.text2 = data;
    }
}
