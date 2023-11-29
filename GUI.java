import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Vector;

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
            "3: Sair da Conta"
        };
        int choice=-1;
        String input="-1";
        String placa="";
        int tipo;
        String id ="";
        String cor;
        String modelo;
        float precoVeiculo;
        String anoFabricacao;
        Funcionario func = cadastro.getFuncionarioLogado();
        while (choice != 3) {
            while(!(input.equals("1")|| input.equals("2") || input.equals("3"))){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println(slogan);
                System.out.println("Bem vindo de volta "+func.getNome());
                for (String option : menuOptionsFunc) {
                    System.out.println(option);
                }
                System.out.print("\nEscolha uma opção (1-3): ");
                input = scanner.nextLine();
            }
            choice=Integer.parseInt(input);
            input="-1";
            switch (choice) {
                case 1:
                    choice=-1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.print("Digite 0 para bicicleta,1 para carro ou 2 para retornar:");
                    input= scanner.nextLine();
                    if(input.equals("2"))
                        break;
                    while(!(input.equals("0")|| input.equals("1")) || input.equals("2")){
                        System.out.print("Tipo Inválido! Favor digite 0 para bicicleta,1 para carro ou 2 para retornar:");
                        input= scanner.nextLine();
                    }
                    tipo = Integer.parseInt(input);
                    if(input.equals("1")){
                        System.out.print("Favor digitar a placa do veículo:");
                        placa= scanner.nextLine();
                    }
                    System.out.print("Favor digitar a cor do veículo:");
                    cor= scanner.nextLine();
                    System.out.print("Favor digitar o modelo do veículo:");
                    modelo= scanner.nextLine();
                    System.out.print("Favor digitar o preço do veículo:");
                    input= scanner.nextLine();
                    while(!isValidFloat(input)) {
                        System.out.print("Favor digitar um preço válido para o veículo:");
                        input= scanner.nextLine();
                    }
                    precoVeiculo= Integer.parseInt(input);                    
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
                    input=scanner.nextLine();
                    if(input.equals("2"))
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
            "1: Pesquisar Veículo",
            "2: Devolver Veículo",
            "3: Mudar Senha",
            "4: Sair da Conta"
        };
        int choice = -1;
        int tipo=-1;
        String input = "-1";
        Cliente cliente = cadastro.getClienteLogado();
        LocalDate dataInicio;
        LocalDate dataFim;
        while (choice != 4) {
            while(!(input.equals("1")|| input.equals("2") || input.equals("3") || input.equals("4") )){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println(slogan);
                System.out.println("Bem vindo de volta "+cliente.getNome());
                for (String option : menuOptionsCliente) {
                    System.out.println(option);
                }
                System.out.print("\nEscolha uma opção (1-4): ");
                input = scanner.nextLine();
            }
            choice=Integer.parseInt(input);
            input="-1";
            switch (choice) {
                case 1:
                    choice=-1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println(slogan);
                    System.out.println("Bem vindo de volta "+cliente.getNome());
                    Vector<Veiculo> veiculos = cadastro.getVeiculos();
                    System.out.print("Digite 0 para bicicleta,1 para carro ou 2 para retornar:");
                    input= scanner.nextLine();
                    if(input.equals("2"))
                        break;
                    while(!(input.equals("0")|| input.equals("1")) || input.equals("2")){
                        System.out.print("Tipo Inválido! Favor digite 0 para bicicleta,1 para carro ou 2 para retornar:");
                        input= scanner.nextLine();
                    }
                    tipo = Integer.parseInt(input);
                    if(tipo==1)
                        System.out.println("Favor escolher o veículo a ser alugado com base eu sua placa:\nCaso desejar retornar digite 0");
                    else
                        System.out.println("Favor escolher a bicileta a ser alugado com base eu seu ID:\nCaso desejar retornar digite 0");
                    for (Veiculo v : veiculos) {
                        if(v.getDisponivel() && (v.getTipo()==tipo)){
                            System.out.println("------------------------------------------");
                            if(v.getTipo()==1)
                                System.out.println("Placa: "+v.getPlaca());
                            else
                                System.out.println("id: "+v.getId());
                            System.out.println("Modelo: "+v.getModelo());
                            System.out.println("Cor: "+v.getCor());
                            System.out.println("Ano: "+v.getAnoFabricacao());
                            System.out.println("Preço: "+v.getPrecoVeiculo());
                        }
                    }   
                    input = scanner.nextLine();
                    if(input.equals("0"))
                        break;
                    for (Veiculo v : veiculos) {
                        if (tipo==1 && v.getTipo()==1) {
                            if(v.getPlaca().equals(input)){
                                System.out.println("Selecionou para alugar Veículo de placa "+v.getPlaca());
                                System.out.println("Por favor digite a data de inicio do aluguel (Dia-Mês-Ano):");
                                while(true){
                                    try {
                                        input= scanner.nextLine();
                                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                                        dataInicio = LocalDate.parse(input, formatter);
                                        break;
                                    } catch (DateTimeParseException e) {
                                        System.out.println("Data inválida. Favor digitar uma entrada no formato (Dia-Mês-Ano) ");
                                    }
                                }
                                System.out.println("Por favor digite a data de devolução do veículo (Dia-Mês-Ano):");
                                while(true){
                                    try {
                                        input= scanner.nextLine();
                                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                                        dataFim = LocalDate.parse(input, formatter);
                                        int result = dataInicio.compareTo(dataFim);
                                        if (result>=0)
                                            System.out.println("A data de devolução deve vir após a data de início.Favor digitar novamente:");
                                        else{
                                            long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
                                            System.out.println("O aluguel custará "+(v.getPrecoVeiculo()* dias));
                                            System.out.println("Gostaria de adicionar o seguro ao custo de 50 reais ao dia? O preço total nesse caso será de "+ ((v.getPrecoVeiculo() + 50)* dias));
                                            System.out.println("Digite 0 para retornar, 1 para proseguir sem seguro e 2 para prosseguir com seguro:");
                                            input= scanner.nextLine();
                                            if(input.equals("0"))
                                                break;
                                            while(!(input.equals("1")) || input.equals("2")){
                                                System.out.println("Valor inválido. Digite 0 para retornar, 1 para proseguir sem seguro e 2 para prosseguir com seguro:");
                                                input= scanner.nextLine();
                                                if(input.equals("0"))
                                                    break;
                                            }                       
                                                CtrlAluguel aluguel = new CtrlAluguel(cliente, v);
                                                aluguel.solicitaAluguel(v, dataInicio, dataFim);
                                                if (input.equals("2")) 
                                                    aluguel.contratarSeguro();
                                            }
                                            break;

                                        }

                                    } catch (DateTimeParseException e) {
                                        System.out.println("Data inválida. Favor digitar uma entrada no formato (Dia-Mês-Ano) ");
                                    }
                                }

                            }
                        
                        
                        }else if(tipo == 2 && v.getTipo()==2){
                            if(v.getId().equals(input)){

                        }
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    String novaSenha="aux";
                    String novaSenhaCopia="aux1";
                    choice=-1;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Deseja trocar a senha?\nDigite qualquer tecla para confirmar ou 2 para retornar:");
                    input=scanner.nextLine();
                    if(input.equals("2"))
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
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
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
        String input="-1";
        String senhaAdmin;
        int aux;
        Boolean logou=false;

        while (choice != 3) {
            while(!(input.equals("1")|| input.equals("2") || input.equals("3"))){
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println(slogan);
                    for (String option : menuOptions) {
                    System.out.println(option);
                }
                System.out.print("\nEscolha uma opção (1-3): ");
                input = scanner.nextLine();
            }
            choice=Integer.parseInt(input);
            input="-1";
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
                            if(tipo.equals("0"))
                                menuFunc();
                            else
                                menuCliente();
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