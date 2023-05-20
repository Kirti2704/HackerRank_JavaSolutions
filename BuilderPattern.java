interface houseBuilder {
    void buildWalls();
    void buildDoors();
    void buildWindows();
    void buildRoof();
    void buildGarrage();
    void getResult();

}

class Castle implements houseBuilder {
    public void buildWalls(){
        System.out.println("Build four walls with type Load bearing wall");
    }
    public void buildDoors(){
        System.out.println("Build doors made of heavy iron doors.");
    }
    public void buildWindows(){
        System.out.println("Build windows in every room of glass type window.");
    }
    public void buildRoof(){
        System.out.println("Build roof made of shingles.");
    }
    public void buildGarrage(){
        System.out.println("Build two garrage with equal space.");
    }
    public void getResult(){
        System.out.println("Castle will have the following constructions: ");
    }

}

class Bungalow implements houseBuilder {
    public void buildWalls(){
        System.out.println("Build five walls with type Veneered Walls");
    }
    public void buildDoors(){
        System.out.println("Build doors made of Battened and Ledged Doors.");
    }
    public void buildWindows(){
        System.out.println("Build windows in every room of glass type window.");
    }
    public void buildRoof(){
        System.out.println("Build roof which looks like Sawtooth.");
    }
    public void buildGarrage(){
        System.out.println("Build one garrage with large space.");
    }
    public void getResult(){
        System.out.println("Bungalow will have the following constructions: ");
    }

}

class Villa implements houseBuilder {
    public void buildWalls(){
        System.out.println("Build two walls with Curved walls and arching ceilings ");
    }
    public void buildDoors(){
        System.out.println("Build doors made of contrasting silver and wood.");
    }
    public void buildWindows(){
        System.out.println("Build windows in every room equipped with a twin sash, a bug mesh.");
    }
    public void buildRoof(){
        System.out.println("Build roof which looks like Gable Roof: The triangular spot.");
    }
    public void buildGarrage(){
        System.out.println("Build one garrage with small garage, are short on space.");
    }
    public void getResult(){
        System.out.println("Villa will have the following constructions: ");
    }

}

class house {
    public static void main(String[] args) {
        Castle c = new Castle();
        c.getResult();
        c.buildWalls();
        c.buildDoors();
        c.buildWindows();
        c.buildRoof();
        c.buildGarrage();
        System.out.println("  ");

        Bungalow b = new Bungalow();
        b.getResult();
        b.buildWalls();
        b.buildDoors();
        b.buildWindows();
        b.buildRoof();
        b.buildGarrage();
        System.out.println("  ");

        Villa v = new Villa();
        v.getResult();
        v.buildWalls();
        v.buildDoors();
        v.buildWindows();
        v.buildRoof();
        v.buildGarrage();
    
    }
}
