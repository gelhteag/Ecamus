

public class Mecanicien extends Personnage {

    public Mecanicien(int pv, int force, int energie) {
        this.pv = pv;
        this.force = force;
        this.energie = energie;
        this.minDamage =+ 2;
        this.maxDamage =+ 2;
    }

    public void setPV(int pv){
        this.pv = pv;
    }

    public void draw() {
        System.out.println("Mecancien: " + pv + ", " + force + "," + energie );
    }

    public void parer(){
        force=-1;
    }
}
