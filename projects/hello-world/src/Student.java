public class Student extends Persona {
    private int ingressScore;
    public int getIngressScore() {
        return ingressScore;
    }
    public void setIngressScore(int ingressScore) {
        this.ingressScore = ingressScore;
    }

    public void uploadHomework(){


    }

    public String toString(){
        return ingressScore +
                "->" +
                super.getDNI();
    }
}
