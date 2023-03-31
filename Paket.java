public class Paket{
    private int kliciEnot;
    private int sporocilaEnot;
    private int prenosEnot;


    Paket(int kliciEnot, int sporocilaEnot, int prenosEnot){
        this.kliciEnot = kliciEnot;
        this.sporocilaEnot = sporocilaEnot;
        this.prenosEnot = prenosEnot;
    }

    public boolean ustreza (int kliciZahtevano, int sporocilaZahtevano, int prenosZahtevano){
        return((kliciEnot>=kliciZahtevano && sporocilaEnot>=sporocilaZahtevano && prenosEnot>= prenosZahtevano));
    }
}