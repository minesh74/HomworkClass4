package que12;
     /*Write a class with the name Cylinderthat extends Circle class. The class needs one field (instance
        variable) with name height of type double.
        The class needsto have one constructor with two parametersradius and height both oftype double.
        It needs to call the parent constructor and initialize a height field.
        In case the height parameter islessthan 0 it needsto set the height field value to 0.
        Write the following methods (instance methods):
        ● Method named getHeight without any parameters, it needsto return the value of height
        field.
        Method named getVolume without any parameters, it needsto return the calculated volume.
        To calculate volume, multiply the area with height. */

    public class Cylinder extends Circle {
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
           this.height = height < 0 ? 0 : height;
            if ((radius < 0) && (height < 0)){
                this.getRadius();
                this.getHeight();
            } else if ((radius < 0) && (height > 0)) {
                this.getHeight();
                this.getHeight();
            } else if ((radius > 0) && (height < 0)) {
                this.getHeight();
                this.getHeight();
            }

        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return getArea() * getHeight();
        }
    }
