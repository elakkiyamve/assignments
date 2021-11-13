public class assign_smallestAmongInt_java {
    public static void main(String[] args) {
        int a= 5, b=8, c=2, d=3;

        if(a<b && a<c && a<d)
            System.out.println( a + " is the smallest");
        else if(b<a && b<c && b<d)
            System.out.println( b + " is the smallest ");
        else if(c<a && c<b && c<d)
            System.out.println( c + " is the smallest");
        else if(d<a && d<b && d<c)
            System.out.println( d + " is the smallest ");
    }
}
