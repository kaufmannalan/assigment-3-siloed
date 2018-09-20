public class Main {

    public static void main(String[] args) {
	// write your code here
        float h1= 72.0f;
        float h2= 19.0f;
        float h3= 50.0f;
        float h4=67.0f;
        float h5=16.0f;
        float h6=53.0f;
        float h7=69.0f;
        float h8=30.0f;
        float h9=52.0f;
        float h10=40.0f;
        float h11=31.0f;
        float h12=75.0f;
        float d1=22.0f;
        float d2=18.0f;
        float d3=13.0f;
        float d4=16.0f;
        float d5=14.0f;
        float d6=23.0f;
        float d7=22.0f;
        float d8=22.0f;
        float d9=23.0f;
        float d10=16.0f;
        float d11=18.0f;
        float d12=23.0f;
        float pi1=3.14f;

        float towVol1=pi1*(d1/2)*(d1/2)*h1;
        float towVol2=pi1*(d2/2)*(d2/2)*h2;
        float towVol3=pi1*(d3/2)*(d3/2)*h3;
        float towVol4=pi1*(d4/2)*(d4/2)*h4;
        float towVol5=pi1*(d5/2)*(d5/2)*h5;
        float towVol6=pi1*(d6/2)*(d6/2)*h6;
        float towVol7=pi1*(d7/2)*(d7/2)*h7;
        float towVol8=pi1*(d8/2)*(d8/2)*h8;
        float towVol9=pi1*(d9/2)*(d9/2)*h9;
        float towVol10=pi1*(d10/2)*(d10/2)*h10;
        float towVol11=pi1*(d11/2)*(d11/2)*h11;
        float towVol12=pi1*(d12/2)*(d12/2)*h12;

        float tVolume=towVol1+towVol2+towVol3+towVol4+towVol5+towVol6+towVol7+towVol8+towVol9+towVol10+towVol11+towVol12;
        float m3pperson=(tVolume/(28f*37640f));
        float m3save=.246f-m3pperson;
        float save=(m3save*65f)/.246f;


        System.out.println("Each person needs to save "+save+" gallons of water everyday from their usual consumption of 65 gal");















    }
}
