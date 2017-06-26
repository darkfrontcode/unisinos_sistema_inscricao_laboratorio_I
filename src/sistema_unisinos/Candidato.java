package sistema_unisinos;

public class Candidato {

    private int numero_cadastro;
    private String nome;
    private String curso;
    private String data;
    private Campus campus;

    public Candidato(
        int numero_cadastro,
        String nome,
        String curso,
        String data,
        Campus campus
    )
    {
        this.numero_cadastro = numero_cadastro;
        this.nome = nome;
        this.curso = curso;
        this.data = data;
        this.campus = campus;
    }

/* ===========================================
    -- Número
=========================================== */

    public int getNumeroCadastro()
    {
        return numero_cadastro;
    }

    public void setNumeroCadastro(int numero_cadastro)
    {
        this.numero_cadastro = numero_cadastro;
    }

/* ===========================================
    -- Nome
=========================================== */

    public String getNome()
    {
        return nome;
    }

    public String setNome(String nome)
    {
        return this.nome = nome;
    }

/* ===========================================
    -- Curso
=========================================== */

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

/* ===========================================
    -- Data
=========================================== */

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

/* ===========================================
    -- Campus
=========================================== */

    public Campus getCampus()
    {
        return campus;
    }

    public void setCampus(Campus campus)
    {
        this.campus = campus;
    }

/* ===========================================
    -- Informações do candidato
=========================================== */

    public void info()
    {
        Log.out("=== Informações do Candidato ===");
        Log.out("Número de cadastro: " + numero_cadastro);
        Log.out("Nome: " + nome);
        Log.out("Curso: " + curso);
        Log.out("Data de inscrição: " + data);
        campus.info();
    }

}
