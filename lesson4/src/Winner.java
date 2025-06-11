public class Winner {
    public double whowon(Member[] members, double max) {

        int i = 0;
        max = members[i].getMiles();
        String name_max = "";
        for (i = 0; i < members.length; i++) {
            double base = members[i].getMiles();
            if (base > max) {
                max = members[i].getMiles();
                name_max = members[i].getName();
            }

        }
        System.out.println("Winner is " + name_max + " Who walked " + max + " Miles");
        return max;
    }

}



