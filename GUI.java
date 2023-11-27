import java.util.Scanner;

public class GUI{
    String slogan = "Aluguel Legal - Sua melhor escolha em aluguel de veículos!";
    Scanner scanner = new Scanner(System.in);
    CtrlCadastro cadastro = new CtrlCadastro();

    
    public static boolean isValidFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void menuFunc(){
        String[] menuOptionsFunc = {
            "1: Cadastrar Veículo",
            "2: Mudar Senha",
            "3: Sair da conta"
        };
        int choice=-1;
        String entry="-1";
        String placa=null;
        int tipo;
        String id = null;
        String cor;
        String modelo;
        float precoVeiculo;
        String anoFabricacao;
        Funcionario func = cadastro.getFuncionarioLogado();
        while (choice != 3) {
            while(!(entry.equals("1")|| entry.equals("2") || entry.equals("3"))){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println(slogan);
                System.out.println("Bem vindo de volta "+func.getNome());
                for (String option : menuOptionsFunc) {
                    System.out.println(option);
                }
                System.out.print("\nEscolha uma opção (1-3): ");
                entry = scanner.nextLine();
            }
            choice=Integer.parseInt(entry);
            entry="-1";
            switch (choice) {
                case 1:
                    choice=-1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.print("Digite 0 para bicicleta,1 para carro ou 2 para retornar:");
                    entry= scanner.nextLine();
                    if(entry.equals("2"))
                        break;
                    while(!(entry.equals("0")|| entry.equals("1")) || entry.equals("2")){
                        System.out.print("Tipo Inválido! Favor digite 0 para bicicleta,1 para carro ou 2 para retornar:");
                        entry= scanner.nextLine();
                    }
                    tipo = Integer.parseInt(entry);
                    if(entry.equals("1")){
                        System.out.print("Favor digitar a placa do veículo:");
                        placa= scanner.nextLine();
                    }
                    System.out.print("Favor digitar a cor do veículo:");
                    cor= scanner.nextLine();
                    System.out.print("Favor digitar o modelo do veículo:");
                    modelo= scanner.nextLine();
                    System.out.print("Favor digitar o preço do veículo:");
                    entry= scanner.nextLine();
                    while(!isValidFloat(entry)) {
                        System.out.print("Favor digitar um preço válido para o veículo:");
                        entry= scanner.nextLine();
                    }
                    precoVeiculo= Integer.parseInt(entry);                    
                    System.out.print("Favor digitar o ano de fabricação do veículo:");
                    anoFabricacao = scanner.nextLine();
                    cadastro.cadastrarVeiculo(placa, tipo, id, cor, modelo, precoVeiculo,anoFabricacao);
                    break;

                case 2:
                    String novaSenha="aux";
                    String novaSenhaCopia="aux1";
                    choice=-1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Deseja trocar a senha?\nDigite qualquer tecla para confirmar ou 2 para retornar:");
                    entry=scanner.nextLine();
                    if(entry.equals("2"))
                        break;
                    System.out.println("Favor digitar a nova senha:");
                        novaSenha= scanner.nextLine();
                        System.out.println("Favor digitar novamente a mesma senha:");
                        novaSenhaCopia= scanner.nextLine();
                    while(!novaSenha.equals(novaSenhaCopia)){
                        System.out.println("As entradas devem ser iguais!");
                        System.out.println("Favor digitar a nova senha:");
                        novaSenha= scanner.nextLine();
                        System.out.println("Favor digitar novamente a mesma senha:");
                        novaSenhaCopia= scanner.nextLine();
                    }
                    cadastro.definirSenha(novaSenha,0);
                    break;
                case 3:
                    break;
                
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

    }

    public void menuCliente(){
        String[] menuOptionsCliente = {
            "1: Cadastrar Veículo",
            "2: Mudar Senha"
        };

    }

    public void menuPrincipal(){
        String[] menuOptions = {
            "1: Cadastrar novo usuário",
            "2: Logar no sistema",
            "3: Sair"
        };
       
        int choice = -1;
        String nome;
        String login;
        String email;
        String senha;
        String tipo;
        String entry="-1";
        String senhaAdmin;
        int aux;
        Boolean logou=false;

        while (choice != 3) {
            while(!(entry.equals("1")|| entry.equals("2") || entry.equals("3"))){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("\n" + slogan);
                    for (String option : menuOptions) {
                    System.out.println(option);
                }
                System.out.print("\nEscolha uma opção (1-3): ");
                entry = scanner.nextLine();
            }
            choice=Integer.parseInt(entry);
            entry="-1";
            switch (choice) {
                case 1:
                    choice=-1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.print("Favor digitar seu nome:");
                    nome= scanner.nextLine();
                    System.out.print("Favor digitar seu login:");
                    login= scanner.nextLine();
                    System.out.print("Favor digitar seu email:");
                    email= scanner.nextLine();
                    System.out.print("Favor digitar sua senha:");
                    senha= scanner.nextLine();
                    System.out.print("Digite 0 se for funcionário e 1 se for cliente:");
                    tipo= scanner.nextLine();
                    while(!(tipo.equals("0")|| tipo.equals("1"))){
                        System.out.print("Tipo Inválido! Favor escolher 0 para funcionário ou 1 para cliente:");
                        tipo= scanner.nextLine();
                    }
                    aux= Integer.parseInt(tipo);
                    if(aux==0){
                        System.out.println("Favor digitar a senha de admin ou digite 0 para voltar para o menu:");
                        senhaAdmin= scanner.nextLine();
                        if(senhaAdmin.equals("0")){
                            break;
                        }
                        while(!(senhaAdmin.equals("123mudar") || senhaAdmin.equals("0"))){
                            if(senhaAdmin.equals("0")){
                                break;
                            }
                            System.out.println("Senha inválida, tente novamente ou digite 0 para voltar para o menu");
                            senhaAdmin= scanner.nextLine();
                        }
                    }
                    cadastro.cadastrarUsuario(nome, login, email, senha, aux);
                    break;

                case 2:
                    choice=-1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    while(!logou){
                        System.out.println("Digite 0 se for funcionário,1 se for cliente ou 2 para retornar:");
                        tipo= scanner.nextLine();
                        if(tipo.equals("2"))
                            break;
                        while(!(tipo.equals("0")|| tipo.equals("1")) || tipo.equals("2")){
                            System.out.println("Tipo Inválido! Favor digite 0 se for funcionário,1 se for cliente ou 2 para retornar:");
                            tipo= scanner.nextLine();
                            if(tipo.equals("2"))
                                break;
                        }
                        aux= Integer.parseInt(tipo);
                        System.out.println("Favor digitar seu login:");
                        login= scanner.nextLine();
                        System.out.println("Favor digitar sua senha:");
                        senha= scanner.nextLine();
                        logou=cadastro.efetuarLogin(login, senha,aux);
                        if(!logou)
                            System.out.println("Usuário ou senha errados");
                        else{
                            menuFunc();
                        }
                    }
                    logou=false;
                    break;

                case 3:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }
}