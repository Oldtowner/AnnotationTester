package ie.oldtowner;

/**
 * Created by walshejo on 21/03/2017.
 */
public class AnnotationTester {
    public static void main(String[] args) {
        SocialNetworkTest sNT = new SocialNetworkTest();
        System.out.println(TestAnalyzer.getNumAnnotatedMethods(sNT.getClass()));
    }
}
