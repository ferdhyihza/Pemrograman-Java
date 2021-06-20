package com.folder.my;

public class Car {

        public Car(String warna , int kecepatan )
        {
                this.color = warna;
                this. speed = kecepatan;


        }

        public Car( )
        {


        }

        public int max (int a , int b)
        {

                if(a>b) return a;

                return b;


        }

        public float max (float C , float b)
        {

                if(C>b) return C;

                return b;


        }

        // attribute declarations
        public String color;
        public int speed;
        public  int power;

// method declarations
        public void drive()
        {	// ….
        }

        public void turnRight()
        {	// ….
        }

        public void turnLeft()
        {	// ….
        }

        public void stop()
        {	// ….
        }


}
