package java_projects.java_seminar_6;

public class Notebook {
    private String marka;
    private int ozu;
    private int zhd;
    private String os;
    private String color;

    public Notebook(String marka, int ozu, int zhd, String os, String color) {
        this.marka = marka;
        this.ozu = ozu;
        this.zhd = zhd;
        this.os = os;
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public int getOzu() {
        return ozu;
    }

    public int getZhd() {
        return zhd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String res = new String();
        res += "-------------------------------------------------------------\n";
        res += marka;
        res += "\n";
        res += ozu;
        res += " GB ОЗУ\n";
        res += zhd;
        res += " GB ПЗУ\n";
        res += os;
        res += "\n";
        res += color;
        res += " цвет";
        return res;
    }

}