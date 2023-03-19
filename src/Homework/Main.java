package Homework;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree() {
           String displayName = "Birch";

            @Override
            public void doSommer() {
                System.out.println(displayName + " tree has grown in Summer."+growPlants()+" height");
            }

            @Override
            public void doAutumn() {
                System.out.println( displayName + " tree is not growing  in Autumn."+growPlants()+" height");
            }

            @Override
            public void doSpring() {
                System.out.println(displayName+ " has grown in Spring." +growPlants()+" height");
            }

            @Override
            public void doWinter() {
                System.out.println(displayName+"is not growing  in Winter."+growPlants()+" height");
            }
        };
        tree.doSommer();
        tree.doAutumn();
        tree.doSpring();
        tree.doWinter();
        System.out.println();

        Flower flower = new Flower() {
            String displayName = "Rose";
            @Override
            public void doSommer() {
                System.out.println( displayName + " flower has grown in Summer."+growPlants()+" height");
            }

            @Override
            public void doAutumn() {
                System.out.println(displayName + " flower is not growing  in Autumn."+growPlants()+" height");
            }

            @Override
            public void doSpring() {
                System.out.println(displayName+" has grown in Spring."+growPlants()+"height");
            }

            @Override
            public void doWinter() {
                System.out.println(displayName+" is not growing  in Winter."+ growPlants()+"height");
            }
        };
        flower.doSommer();
        flower.doAutumn();
        flower.doSpring();
        flower.doWinter();

    }
    /*Growing plants for 1 years:
    Birch tree has grown in Summer.10 height
Birch tree is not growing  in Autumn.10 height
Birch has grown in Spring.10 height
Birchis not growing  in Winter.10 height

Rose flower has grown in Summer.5 height
Rose flower is not growing  in Autumn.5 height
Rose has grown in Spring.5height
Rose is not growing  in Winter.5height */

    /*Growing plants for 2 years:
    Birch tree has grown in Summer.20 height
Birch tree is not growing  in Autumn.20 height
Birch has grown in Spring.20 height
Birchis not growing  in Winter.20 height

Rose flower has grown in Summer.10 height
Rose flower is not growing  in Autumn.10 height
Rose has grown in Spring.10height
Rose is not growing  in Winter.10height
     */
    /**Growing plants for 3 years:
     Birch tree has grown in Summer.30 height
     Birch tree is not growing  in Autumn.30 height
     Birch has grown in Spring.30 height
     Birchis not growing  in Winter.30 height

     Rose flower has grown in Summer.15 height
     Rose flower is not growing  in Autumn.15 height
     Rose has grown in Spring.15height
     Rose is not growing  in Winter.15height

     */



    }


