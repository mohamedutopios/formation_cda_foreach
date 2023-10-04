 do {
            System.out.println("=== Menu principal ===");
            System.out.println();
            System.out.println("1. Ajouter un client");
            System.out.println("2. Afficher la liste des clients");
            System.out.println("3. Afficher les réservations d'un clients");
            System.out.println("4. Ajouter une réservation");
            System.out.println("5. Annuler une réservation");
            System.out.println("6. Afficher la liste des réservations");
            System.out.println("0. Quitter");
            System.out.println("Votre choix :");

            choix= scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajoutClient();
                    break;
                case 2:
                    afficherClients();
                    break;
                case 3 :
                    afficherReservationsClient();
                    break;
                case 4 :
                    ajoutReservation();
                    break;
                case 5 :
                    annulerReservation();
                    break;
                case 6 :
                    afficherReservations();
                    break;
                case 0 :
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un choix valide !!!!");

            }


        }while (choix != 0);