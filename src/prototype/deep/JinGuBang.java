package prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {
    private float height = 100;
    private float d = 10;

    public void big(){
        this.d *=2;
        this.height *=2;
    }

    public void small(){
        this.height/=2;
        this.d/=2;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }
}
