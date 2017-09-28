package yycg.base.pojo.po;

public class QRCode {
    private String content;

    private String imgName;
    
    private String result;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content;
    }
    
    public String getImgName() {
        return content;
    }

    public void setImgName(String name) {
        this.imgName = name == null ? null : name.trim();
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}