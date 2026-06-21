class Data {
    int dia, mes, ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia; this.mes = mes; this.ano = ano;
    }
    
    public boolean anoBissexto() {
        if (!dataValida()) return false;
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    public boolean dataValida() {
        if (mes < 1 || mes > 12 || dia < 1) return false;
        int diasNoMes = 31;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) diasNoMes = 30;
        else if (mes == 2) diasNoMes = anoBissexto() ? 29 : 28;
        return dia <= diasNoMes;
    }
    
    public void imprime(String separador) {
        if (!dataValida()) {
            System.out.println("INVALIDA");
        } else {
            System.out.println(dia + separador + mes + separador + ano);
        }
    }
}