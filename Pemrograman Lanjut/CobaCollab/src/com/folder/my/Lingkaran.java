package com.folder.my;

public class  Lingkaran {


    public int _radius;
    int lokal;
    public Car mobil = new Car();

    public Lingkaran()
    {this(10,10,new Car());
        

    }

    public Lingkaran(int _radius, int lokal, Car mobil) {
        this._radius = _radius;
        this.lokal = lokal;
        this.mobil = mobil;
    }

    public int get_radius() {
        int lokal;
        this.lokal = 100;
        lokal =10;

     mobil.color = "white";
        return _radius;
    }

    public void set_radius(int _radius) {
        lokal = 10;
        this._radius = _radius;
    }

    public float getLuas()
    {
        return 22/7 *_radius*_radius ;
    }

}
