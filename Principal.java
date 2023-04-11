public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriella");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(16);
        System.out.println(pessoa.getIdade());
        pessoa.setCelular("(18)99806-2006");
        System.out.println(pessoa.getCelular());
        pessoa.setCpf("48188693847");
        System.out.println(pessoa.getCpf());


    }
}
