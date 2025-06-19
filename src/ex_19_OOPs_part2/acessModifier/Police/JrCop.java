package ex_19_OOPs_part2.acessModifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
//        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}
