package module5;

import java.util.Objects;

class Point {
  private int x;
  private int y;
  private int z;

  public int getX() {
   return x;
  }

  public void setX(int x) {
   this.x = x;
  }

  @Override
  public boolean equals(Object obj) {
   if (this == obj) {
    return true;
   }else{
    return false;
   }
  }

 @Override
 public int hashCode() {
  return Objects.hash(x, y, z);
 }

 public int getY() {
   return y;
  }

  public void setY(int y) {
   this.y = y;
  }

  public int getZ() {
   return z;
  }

  public void setZ(int z) {
   this.z = z;
  }
 }
