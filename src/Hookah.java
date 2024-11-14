public class Hookah {

    private String fortress;

    private String  taste;

    public Hookah(String fortress, String taste) {
        this.fortress = fortress;
        this.taste = taste;
    }

    public String getFortress() {
        return fortress;
    }

    public String getTaste() {
        return taste;
    }

    public void setFortress(String fortress) {
        this.fortress = fortress;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString(){
        return "hookah " + fortress + " " + taste;

    }
}
