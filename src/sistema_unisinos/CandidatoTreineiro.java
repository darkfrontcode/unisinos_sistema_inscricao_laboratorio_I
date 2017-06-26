package sistema_unisinos;

public class CandidatoTreineiro extends Candidato {

    private String extraInfoOne;
    private String extraInfoTwo;

    public void CandidatoTreineiro(
        int numero_cadastro,
        String nome,
        String curso,
        String data,
        Campus campus,
        String extraInfoOne,
        String extraInfoTwo
    ){
        super(
            numero_cadastro,
            nome,
            curso,
            data,
            campus
        );

        this.extraInfoOne = extraInfoOne;
        this.extraInfoTwo = extraInfoTwo;
    }

    public void CandidatoTreineiro(
        int numero_cadastro,
        String nome,
        String curso,
        String data,
        Campus campus
    )
    {
        super(
            numero_cadastro,
            nome,
            curso,
            data,
            campus
        );
    }

/* ===========================================
    -- Extra Info One
=========================================== */

    public String getExtraInforOne()
    {
        return extraInfoOne;
    }

    public void setExtraInforOne(String extraInfoOne)
    {
        this.extraInfoOne = extraInfoOne;
    }

/* ===========================================
    -- Extra Info Two
=========================================== */

    public String getExtraInforTwo()
    {
        return extraInfoTwo;
    }

    public void setExtraInforTwo(String extraInfoTwo)
    {
        this.extraInfoTwo = extraInfoTwo;
    }

}
