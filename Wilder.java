public class Wilder {

    // attributs
    private String firstname;
    private boolean aware;

    // constructeurs
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // accesseurs (getters)
    public String getFirstName() {
        return this.firstname;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    // mutateurs (setters)
    
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // méthode instanciée
    public String WhoAmI() {
        if ( aware == true){

        return  "Je m'appelle" + this.getFirstName() + "et je suis aware";
        } else {
        return  "Je m'appelle" + this.getFirstName() + "et je ne suis pas aware";
        }
    }
    
}