package com.conway.values;

public class Coordinates {
  public Integer x,y;
  
  public Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof Coordinates))
      return false;
    Coordinates other = (Coordinates) obj;
    if (x != other.x)
      return false;
    if (y != other.y)
      return false;
    return true;
  }

  public Coordinates topLeft() {
    return new Coordinates(x-1,y+1);
  }

  public Coordinates topCenter() {
    return new Coordinates(x,y+1);
  }

  public Coordinates topRight() {
    return new Coordinates(x+1,y+1);
  }

  public Coordinates middleLeft() {
    return new Coordinates(x-1,y);
  }
  
  public Coordinates middleRight() {
    return new Coordinates(x+1,y);
  }
  
  public Coordinates bottomLeft() {
    return new Coordinates(x-1,y-1);
  }
  
  public Coordinates bottomCenter() {
    return new Coordinates(x,y-1);
  }
  
  public Coordinates bottomRight() {
    return new Coordinates(x+1,y-1);
  }

}
