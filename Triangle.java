public class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public boolean verifyTriangle(int one, two, three) {
    if (one + two > three || one + three > two || two + three > one) {
      return false;
    }    
  }
}
