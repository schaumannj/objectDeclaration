package org.od.model;

/**
 * @author sch062
 * @since 2/17/16.
 */
public class Simply {

    private String text;
    private int num;
    private Integer num2;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Simply{" +
                "text='" + text + '\'' +
                ", num=" + num +
                ", num2=" + num2 +
                '}';
    }
}
