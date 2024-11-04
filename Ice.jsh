 Scanner scanner = new Scanner(System.in);

        System.out.println("please input your student number：");
        int studentNumber = scanner.nextInt();
        scanner.nextLine(); 

        int vanillaPrice = studentNumber % 100;
        int chocolatePrice = (studentNumber / 100) % 100;
        int strawberryPrice = studentNumber / 10000;

        System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
        String flavor = scanner.nextLine();

        System.out.println("How many scoops would you like?");
        int scoops = scanner.nextInt();
        scanner.nextLine(); 

        double totalPrice = 0;
        if ("v".equals(flavor)) {
            if (scoops == 1 || scoops == 2 || scoops == 3) {
                totalPrice = 100 + vanillaPrice * scoops;
                System.out.println("That will be " + totalPrice / 100 + " please.");
            } else if (scoops == 0) {
                System.out.println("We don't sell just a cone.");
            } else {
                System.out.println("That's too many scoops to fit in a cone.");
            }
        } else if ("c".equals(flavor)) {
            if (scoops == 1 || scoops == 2 || scoops == 3) {
                totalPrice = 100 + chocolatePrice * scoops;
                System.out.println("That will be " + totalPrice / 100 + " please.");
            } else if (scoops == 0) {
                System.out.println("We don't sell just a cone.");
            } else {
                System.out.println("That's too many scoops to fit in a cone.");
            }
        } else if ("s".equals(flavor)) {
            if (scoops == 1 || scoops == 2 || scoops == 3) {
                totalPrice = 100 + strawberryPrice * scoops;
                System.out.println("That will be " + totalPrice / 100 + " please.");
            } else if (scoops == 0) {
                System.out.println("We don't sell just a cone.");
            } else {
                System.out.println("That's too many scoops to fit in a cone.");
            }
        } else {
            System.out.println("We don't have that flavour.");
        }

        scanner.close();