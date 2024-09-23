public class SmartPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet 

{

  public static void main(String[] args) {
    SmartPhone smartPhone = new SmartPhone();
    smartPhone.ligar("1234567890");
    smartPhone.atender();
    smartPhone.iniciarCorreioVoz();
    smartPhone.atualizarPagina();
    smartPhone.adicionarNovaAba();
    smartPhone.exibirPagina("https://www.google.com");
    smartPhone.tocar();
  }


    //Interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
       System.out.println("Atendendo chamada");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //Interface NavegadorNaInternet
    public void atualizarPagina(){
       System.out.println("Atualizando página");
    }

    public void adicionarNovaAba(){
       System.out.println("Adicionando nova aba");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegando para a URL: " + url);
    }



    //Interface ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando a música ");
    }

    public void pausar() {
        System.out.println("Pausando a música");
    }

    public void selecionarMusica(String musica){
       System.out.println("Selecionando a música: " + musica);
    }




}
