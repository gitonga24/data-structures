package sdObjects;

//import apps.SnowbirdLiftApp;

public class Nascar {
    private String model;
    private String driver;
    private Integer speed =0;

    public Nascar(){}

    public Nascar(String model, String driver){
        this.model = model;
        this.driver = driver;
    }

    public void Accelerate (Integer speed){
        this.speed += speed;
        System.out.println(driver+ "'s car has accelerated by: " + speed);
    }

    	@Override
	public String toString() {
		return "Model: " + model + ", driver: " + driver +" ";
	}



      @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Nascar other = (Nascar) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (model == null) {
                if (other.model != null)
                    return false;
            } else if (!model.equals(other.model))
                return false;
            if (driver == null) {
                if (other.driver != null)
                    return false;
            } else if (!driver.equals(other.driver))
                return false;
            return true;
        }

    public String listChairRiders() {
        return this.model + ", " + this.driver;
    }

    private Nascar getOuterType() {
        return Nascar.this;
    }
}
