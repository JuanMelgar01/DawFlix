package model;
import java.time.LocalDate;

import Util.Graficos.ArteAscii;

public class Pelicula extends Contenido{
    //Atributos
    private final String director;
    private final String [] actores;
    private final String [] idiomas;
    
    // Constructor
    
    public Pelicula(String titulo, String genero, int duracion, String descripcion, LocalDate fechaCreacion,
            LocalDate fechaAltaSistema, tipoContenido tipoSuscripcion, int controlParental, String director, String[] actores,
            String[] idiomas) {
        super(titulo, genero, duracion, descripcion, fechaCreacion, fechaAltaSistema, tipoSuscripcion, controlParental);
        this.director = director;
        this.actores = actores;
        this.idiomas = idiomas;
    }
    public String getDirector() {
        return director;
    }

    public String[] getActores() {
        return actores;
    }
    public String[] getIdiomas() {
        return idiomas;
    }
    @Override
    public String toString() {
        String estrellas =" ";
        for (int i = 0; i < getPuntuacion().intValue(); i++) {
            estrellas = estrellas + "⭐";
        }
        return "\t\t"+ArteAscii.AZUL+"----------------------------------------------------------------------------------------------------------------------------\n" +ArteAscii.RESET+
                "\t\t\t Código " + super.getIdCont() + " - 📽️ - " + titulo + "  -  " + getDirector() + "  -  " + estrellas + " " + getPuntuacion();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((director == null) ? 0 : director.hashCode());
        return result;
    }
    // Sobreescrito equals para comparar titulo y director.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pelicula other = (Pelicula) obj;
        if (director == null || super.titulo == null) {
            if (other.director != null || other.titulo !=null)
                return false;
        } else if (!director.equals(other.director) || !super.titulo.equals(other.titulo))
            return false;
        return true;
    }

    @Override
    public void reproducir() {
        ArteAscii.limpiarConsola();
        String[] frames = {"                                                                                            c\r\n" + //
        "                                                                                 .,,,,.,    cRSS\r\n" + //
        "                                                                         ,csARRRRRRRRRRRRRRRSSSSSRA\r\n" + //
        "                                                                      cASAARRRASscSRRRRRSSSSSRRSRSRRs\r\n" + //
        "                                     ,ccccscccc,..c,.     .       ,cSRRRRRSASScSAARSSSSSSRRRRRSRRAASAR\r\n" + //
        "                              ccSSRSSSSSSSSSSSSSsSARSSSRRARRARSSSSSSSRSsSSSARRSSSSSRSSSAAARRRRRSRRRRSSSSs\r\n" + //
        "                           ,RRSASScSSARRRRRSSSAASSScSSSRSAAARSSRSScSSSSSASSRSSSSRRSSSSARAS    cSSSRRASSSRRc\r\n" + //
        "                          SRRRRRSSRRRRRRRRSSSSSSAASSRRARRAASSSSSsSRRScSSSSSSSRSSSSRSRRRc            ARAAR,\r\n" + //
        "                         cRRRRRRRRRSSSSRRAASRRRASCASRAAARRASSARRRSASRRSSSSSSSSSSSSRRR\r\n" + //
        "                         ARRRRRRRRRSSSSSSAARRRRRASASSSSSSASRRRRRRRSSCAASSRSSRSSSSSS\r\n" + //
        "                       cRRRRs  RRRRSSRRSSRRRRSSRRRASCSAASRRRRAARRSSSSSRRRSRRSSSSSS\r\n" + //
        "                  ,sRRR,  cscSRRRRRARSSSSRRRc     ,RRARRRARAARRRRRSSSSRRRRRRSSSRRR\r\n" + //
        "                ,SRR  RRARRRRRRSSSSScASc               csARRRRRRRASSRRSRRRRRRSSSRc\r\n" + //
        "             ,,     sRRRRRRRRS,                               ,ARRRRRRRRRRRRRRRSS,\r\n" + //
        "                  cRRRS  RS                                      RRRRRR,   ARRRRRS,\r\n" + //
        "                 SRc    ,RR                                    RARRRS         SRRRS\r\n" + //
        "        SRRSccSc       cRR                                   SSSS               cRRSc\r\n" + //
        "                  ,RAScSS                                  ,RRR                   ,RAS\r\n" + //
        "                                                          ,AR                       RRS\r\n" + //
        "                                                         cc                           Sc\r\n" + //
        "                                                     ,ccS, ,,,, , , ,      ,       ,   c,,\r\n" + //
        "     ,,,,,,,cccccccccccccccSSSSSAARRASSScSSSARRRASAASSSRASRRRRRRRRRASSSRRRRRAScSSccSScSSSccSccccccccccccc,,,, ,\r\n" + //
        "                              , , , ,, , ,,,,,,,,, ,,,,,,,,,,,,,, ,, , ,, , ,,, , , , , , , ,",
        "                                                                                        .  Rs\r\n" + //
                                        "                                                                              .ctSSARRRAAACtRAAAc\r\n" + //
                                        "                                                                          ,tARRRAASSSSSSASSSSssSAAS\r\n" + //
                                        "                                                                     .cSARRASSAASSSSSAASSASSARASARRAC\r\n" + //
                                        "                                    ,cSAAASSSSSSSAAASSSCCCSCC,c,.,CARRRAASSASSSSSSSASSsssARAAASSAASSSS,\r\n" + //
                                        "                               AASSSssSSSAAASscSSSSAASSSSSSAAAAASsSsASSSSSAAASSssSASASSARRRAAAAAAARRRsssSc\r\n" + //
                                        "                             SASSSSsSSAAAAAASsSARARAAssSCSSSSARASSSsssASsASssssSAAASSSSAA        ,cSRASAAS\r\n" + //
                                        "                          ,SARASAAAAAAsSSAAASSASRARAASSSSAASSSSSSSASSSssSsscSSSSSSSSAARs              ,\r\n" + //
                                        "                          SRSARSRRARASssssSSsARAASSsSSAAAASSscSSSASsSAAccsSsSSScsSAARR\r\n" + //
                                        "                          ARAAA CRARAAsSSSsSAAASRRAAAAsSSAAASSSSAASSAASSsscSSSSssSAA\r\n" + //
                                        "                       c SRRAR,  RAAAASSSSSAAASSAARRRSSsSSSSSSAAARARRASASSASSSsSSS\r\n" + //
                                        "                     cAAARAASSAAASAAAAASSSAARRC,      ARRAARRASsSSAAARRRARAAAASAS\r\n" + //
                                        "                  ,SSc  SAASAAAAAASSAAAccCc               cARRASSSSAARARRARSSAAS\r\n" + //
                                        "                       cRAs,  AAR                              ,cRRRRRRAAAssRA\r\n" + //
                                        "                       cAc    ,RR                                 RRRRRAAAAc\r\n" + //
                                        "                       sA      ,RA                               RRRRRSAAAS,\r\n" + //
                                        "                ,ccccccc        SsS                             SASA   SASc\r\n" + //
                                        "                             ,cccc                             AASc    ,AAc\r\n" + //
                                        "                             SS,                cRSSscc,  , cRAAA       ASc\r\n" + //
                                        "                                                                        ,RS\r\n" + //
                                        "                               , ,,,,, ,  ,,,c,,,,,,,,, , ,, , , ,    , ,cc ,      ,,\r\n" + //
                                        "     ,,,,,c,cccccccccccccssSSSSSSSSSSSSSSSSSSSAAAAAARARAARARARRRSSsSSAASsc ,cssssssscsSssSSScccccccccccc,,,,, ,\r\n" + //
                                        "                           ,  , , , , ,, , , ,,,,,,,,,,,,,,, ,, ,,,,, , ,, , ,,,, ,,,    ,",
"                                                                                          cRSs\r\n" + //
        "                                                                                  .,cARRRAAASSsAA,\r\n" + //
        "                                                                            .cSRRRRRRRRASSSSAAAAAARc\r\n" + //
        "                                          ,,cccc,,cSSccsst,,.         .,csARRRRSSSSAAAAsAARAASAAASSSA\r\n" + //
        "                                     ,sASASSsssscsSSAASSSSAAAAASsc,SARAAAAAASSAAAAAAAsssSAARAAAAAARAASS\r\n" + //
        "                                ,SSSSsSSAAAAASsSAAAAAAAAAAASSAASSAASSSSSAAAASAASSSAAAssARRS  ,,ccsSAASSARc\r\n" + //
        "                              sRASSssAAAAAAASASAASSASSSAAAAAAAAASSAAAASSASASSSSSASSSSSAAs           ,SRc\r\n" + //
        "                           ,AAAASASSAAASsASsSsSASSAAAASSASSSAAASASSRAsSSSSssASSSSAAAAAA\r\n" + //
        "                            sSSRRRRAAAAASSsssSSAAAAAASSAASsSSAAASAsSAAsssssSSsssAAARA\r\n" + //
        "                           cASSARARRARAAASSssSASARRRAAASSSSSASSSSsSRASAsssSSSSSsARS\r\n" + //
        "                           ARRRRRA  RRAAAASSsSSSARRRRRARAAsSSSSssSSSSSSSASSSSSSSc\r\n" + //
        "                       SAARs   ,cSAAAAAASSSAARRR        SRRASASSsRARRRRAAAASARR\r\n" + //
        "                  ,s, ,,     RRAAAARAARRRRsc                ,sARRRRRRAAAAAARRR\r\n" + //
        "                             ,RAs  RRRR                           AASASSRA,\r\n" + //
        "                              cAc    RRRs                        RAARARRR\r\n" + //
        "                              ,AA      ARRS                     RAAARRRR\r\n" + //
        "                                 c       csc,                 SAAs  SRSc\r\n" + //
        "                               css       ccc           cAASc cRA    sSSc\r\n" + //
        "                              ccc        ss,                sARSsScsSc\r\n" + //
        "                             sAc                           ,cc\r\n" + //
        "             ,    , , ,   , ,,c,,,,,,,, ,,,,,,, , , ,,,, ,  ,c, , ,,c,,  ,,,,     , ,   ,\r\n" + //
        "     ,,,,,cccccccccccccscscSSAAASSSSSSSASSSSSSSSSSSSSAAAAARAsssssSSSAAAAASSSSsscssssscsssssscccccccccc,c,,,,,,\r\n" + //
        "                            ,  , , , , , ,, ,,,,,,,,,,,,,, ,,,,,, ,, ,,,,,,, , , , ,  , , ,",
"                                                                                           ,\r\n" + //
        "                                                                                    ,cSSC  ARAA,\r\n" + //
        "                                                                               ,CRRRRRRAASSCSSSSAS\r\n" + //
        "                                                                           ,cSASSASSSAACASAAAAASARAA\r\n" + //
        "                                           ,csSSAAAACSAASACCsCc,, ...,csSARSSSSSSAAASsCCSAAAAASAAASSA,\r\n" + //
        "                                       ,ASSsSSSSSAAACSCSSSSscCSSAAAARRAASSSSSASSCAAASSSSSAARAAAAARRSSSS,\r\n" + //
        "                                   ,SASsSAAAAASCSCSAAAASSSSSsSSACSASCASAAAASsCsSSSSSSSSSS.        ,AASSAc\r\n" + //
        "                               CAASCSCsSSAAAAAASSSSSsSSSAAAASsSSsSscCCSSAASSSCCSASSSAAA,             ,\r\n" + //
        "                              cAAACACsAAAcSSSASCSssCsSSSAAAAASSCSSSCSSSACsCSASCsSAAAAC\r\n" + //
        "                             sAAAAARAARAAASCSSSCSAAsAAAcSSSASSAsAAAsSAAASsSSACCSSARs\r\n" + //
        "                             SsARRRRRRRRRAAAASACSSCRRRRRAssSSCSSAAAAAASAsCSSSSCSAS\r\n" + //
        "                           ,RARRAAAS  ,AARAAAAASSCARSCRAAARRASSScSSSASSSSSSCSSSAR\r\n" + //
        "                    ,, , SRRRS,         RAAAAASSRRR        ,ARAASRRRAAASAASARAS\r\n" + //
        "                   cSAARC,           ,RARARRRRRRC               ,CRRARASAARRc\r\n" + //
        "                                   AAAAARRRRRC                    SASSCSRRRR,\r\n" + //
        "                                   ,RRAARRRRR,                  cAAAAS ,RRRRs\r\n" + //
        "                                     ,RAs,  ,RAsS,             CAAAA,    AASAc\r\n" + //
        "                                         ,,,     ,Ccc         sAAc         CAS\r\n" + //
        "                                          ,,c      cc,      ,RRA          cRc\r\n" + //
        "                                          ,,,      ,C,  ,, cA,,ARASc,,C,\r\n" + //
        "                                         ,CS     CSCCC\r\n" + //
        "                , , , ,  , ,,       ,,,  , ,,,, ,,,,,,,,,,,, ,  , , , , ,               ,, , ,   ,,,,,  ,,,,\r\n" + //
        "     ,,,,,,,,,ccccccccCCcCCssssCcCsSSASSSASSSsCSSSASSSAAAAARRRRRRRRRRARAASsSsCCCCCCCCccccccc,,,,,,,,,,,,,,,,,\r\n" + //
        "                       ,   ,  , , , ,, , ,,,,, ,,, , ,, ,,,, ,,,, ,, ,, ,,,,, , , , , ,    ,  ,",
"                                                                                         ,S\r\n" + //
        "                                                                                ,cSRRARR,tRSsCsS,\r\n" + //
        "                                                                           ,csSSsSSSSSssCCCsRSSSSS,\r\n" + //
        "                                                .,,..                   ,sAssSssSSssSSCCsSSSSSSSSsSS\r\n" + //
        "                                           cssssSSsSSSSSSsssSss,  .,cCsSSsCstsSSsSSSsssssRRSSsSSSSSssc\r\n" + //
        "                                       ,SSsssSSSssSSASSssSSSSSsSAAAssSSSsssSSSSSSsSSSSSSSSARRRRSRRSCCCss\r\n" + //
        "                                    cSSSssSSSSSSCsSASssSSSSsSssSSsSSSSsSsSSSstCCsssssSSS,         ,sSss,\r\n" + //
        "                                 cSCsSSssSSSSSSsssSCSSSSSSSSAsSSSsSsCssSsSCcssCsSsssSSC\r\n" + //
        "                               ,SSsCSCsSSsCSSSSSCsRSsssSSSssSSSSSCSsCctSSsCsssCcsSSSR\r\n" + //
        "                             ,SsCsSSRSSRRSSssSSSsCCsSASSSASSssssSSssSSSCssCCssCCsSR,\r\n" + //
        "                            ,sCSSSRRSRRRRRRRRRSSSSSssRRRRsSSSsRSSSSASSASSsssCssCSRS\r\n" + //
        "                           SSsSSSSs     SRSRRRSSSSSSRRSRRSSRASssSASSASSCssssCssSRR\r\n" + //
        "                      ,sRRRRRRSt            CRSSSSRRRc      tSRRSSRRSSSSSSSsSRR,\r\n" + //
        "                  ,cRRRRRt                  RRRRSRRRS            ,SRSSSCSRRRRRRc\r\n" + //
        "                                           RRRRRRRC,               SSssS   RRCCsC\r\n" + //
        "                                         RSSSsSRRsC,               RSSs,      ssssC\r\n" + //
        "                                           ,RSsSSCCs,  ,          cSRS,          RSs\r\n" + //
        "                                                 c,,ccsssC,        ssc         , c,\r\n" + //
        "                                                   ,CC   ,Ssc,c ,RRRS,       , ,c\r\n" + //
        "                                                    cc,    RRR             ,C C\r\n" + //
        "                                                    cC,      ,           ,CCS,\r\n" + //
        "           ,       ,,,,   , , ,   , ,,,,,,,,, ,,,,,, ,,,,,,,,,,,,,,,,,,,sRc,c,c,,ct,,,,,t,,,, , ,,,,,, , , ,\r\n" + //
        "     ,,,,,,,,,,,,,ccCCCccCcCCCCCcCsssSSSRSSRSSSSSRSSSSSSSSSRRRRRRRSRSSSsssssCCsCccccc,c,ccc,,,,,,c,,,,,,,,,,,, ,\r\n" + //
        "                     ,    , , , , , ,, , ,, ,,,,, ,, ,,, ,,,, ,, ,,,,,,,, , , , , ,  ,  , ,",
"                                                                                     ..  ASc,\r\n" + //
        "                                                                               ,SRRRAAAAAAASsssAS\r\n" + //
        "                                                                          .cSARSSSSsSAAsSsSSRAAAARS\r\n" + //
        "                                                    ...             .,cSRRRASSSSsSAASsssSAAASSRSSsSS,\r\n" + //
        "                                             ,ctSAAAAASAASAASsSSAAAASsSSssSAAASSSASsSSSSSAAAASAARAASSs\r\n" + //
        "                                         SASSSAASAAAAASRASsSSAAAAAAAASARAARASASsSStSSsSSSAccSRRARRAsssSs\r\n" + //
        "                                     cAASsSAAAAASAASAAAAASsASSAAASsSsSAAAssASssSAAssSAAS           AAsc\r\n" + //
        "                                  sSAAASAAAAAAAASRASSAASSSAASAAAAASSSsssSsSsSSsASSSAAR\r\n" + //
        "                                ARASAASAAASAAAAAASAAAASSSAAAAAAAAAASSSSsSSssSSscSAAA,\r\n" + //
        "                              AASSSARAARRAAASARAAASSSARAASAAAASAAAAAAASSSAASsSSssRAS\r\n" + //
        "                           cASSAASSSARRRRRRRRRRRRRRAAARRAASsSRRAAASSSARRASSSSSSsSAA\r\n" + //
        "                       sSRRARAsSS,      sRRRRRRRAAASsSRRASAARAAASSAAAAASSSASSSSSAc\r\n" + //
        "                   ,ARRRccSt,                 SRRRRASR      cRRRRAAARAAAAAARRRRR\r\n" + //
        "                 ,tc,.                          RRRAARs           ,sRAAsSsARRRScsss\r\n" + //
        "                                               ,ARRAsss              ARAASc   ,AASSAS,\r\n" + //
        "                                               cARAsSSc               ,RRASc       ,RRS,\r\n" + //
        "                                               cRRRASSs      cccc       sAASc        SRc\r\n" + //
        "                                                     cRSc,,cc   ,Ac   ,,,SRAS         ,c\r\n" + //
        "                                                        cscSAc,                      ,ccc\r\n" + //
        "                                                           ,cccc                     ccS\r\n" + //
        "                                                            cRSssc,                 sss\r\n" + //
        "                     ,,,,c,,,,,,,,,,,,c,c,cccc,ccccccccccccsccccsSs,,cssccccccccccccAcccccccccc,,,,,,,,,,,,,, ,\r\n" + //
        "     ,,,,cccccccccccccscsccsssssssscssSSSSSAAASSSAASSSSSSSAASASRAASSSSSssssccccsccccccccccccccccccccccc,,,,,,,\r\n" + //
        "                           , , , , , ,, ,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,, ,,,,, ,, , ,  , ,  ,",
"                                                                                   ..,    Ac\r\n" + //
        "                                                                            .cARRAAASAAASSSSsCCSc\r\n" + //
        "                                                                         ,cSSSsSsSSSSSsCsCssRSSSSS,\r\n" + //
        "                                                     ...             ,sAAAASSSSSSSSSsssCsSSsSsSSssSs\r\n" + //
        "                                              .,,cSSSSSSSSSSSAssSSSSSSSsSSASSSSSSSSSsSsCCsSSSsSSRSSss\r\n" + //
        "                                          CSsSSssSSSSSSSsSSsSSASSSSSSSSSssSssSSsSsStssSSSRccRRRSRRSCCcs\r\n" + //
        "                                     ,SSSCSSSSSssSSSSSSASSsSCSSSSSSSssSSCsCsSSCSSSsCsRS           ,SSst\r\n" + //
        "                                   ,SSSsCSSSSSSSSSSSRSSSSSsSSSSSsssSscssScCsSsCCCssSR,\r\n" + //
        "                               cRSs cSSsSSSSRSSSSSCSSSRSSSSASsSSASSSssCtssSCCssCCsRR\r\n" + //
        "                            ,sSSSSs SsSSSSCSSSSSSSSSCSSSssSscsSSSSSSSSssCSsssCssCSS\r\n" + //
        "                        ,CsSSSSSsSc, RRRRRRSSSSSSSRSsSRSCtsssssssCsSSSssSCsCCCCssSc\r\n" + //
        "                    sRRRRRSSSSs       RRRRRRRRRRSSSSCCRSSSSSSSssssSSsssSssCssssSS,\r\n" + //
        "                ,CSStctcc,               cRRRRRRSRRSSs,  ,SRRRRRSSSSARSSRSsCSRRRSc\r\n" + //
        "                 c                          sRRRRRRRRSs,          ,,csRRSssSscCssCCC,\r\n" + //
        "                                              RRRRRRRRR,                  cRSSSsCsRsCSRs,\r\n" + //
        "                                               RRRRRSRSs                       ,sSs   ,RRR\r\n" + //
        "                                               SRRRsSRRRSC,                     sRR,    ,c,\r\n" + //
        "                                               cSSRS       csc,,cc,  SccCcc  ,c,          ,,c,\r\n" + //
        "                                                 ,SRs           cSsccc, ,,                  s,,\r\n" + //
        "                                                   css,            ,c,c                      scs\r\n" + //
        "                                                     ,,c                                     ,ss,\r\n" + //
        "        , ,,,,, ,,,,,,,,,,,,,,,,,,c,,c,c,,,ccctct,c,tc,,,Ccc,,cctctcttttttttttttctct,tt,,tt,,,,,,,,,,,,,,,,,,\r\n" + //
        "    , ,,,,,,,,,,,ccccCccccccCcCCCCCCCCCcCcCsssCssCCCCCCsCCsCccCcCsSsCsCsCCCCcccCcccccccccccccc,,,c,,,,,,,,,,, ,\r\n" + //
        "                    ,       , , , , , ,,,,, ,, ,,,,,,,,,,, ,, ,,,,,,,,, ,, ,,, , ,, , ,     ,",
"                                                                                      .   ,\r\n" + //
        "                                                                            .,SARRAAAAARRSSRRsss\r\n" + //
        "                                                                         cSSSSsSSSsSSSssCCCCSsSSss\r\n" + //
        "                                                                      .sASsCsCstcsssCcCCSSSsSsSsSSS,\r\n" + //
        "                                                                 ,cctCCstCsstsASSSSSSSsSSRRSsssSSSsCs\r\n" + //
        "                                           ,,  .,ccSSSSSSssSStCsSsSSsSSSSSSSSSssSSssSSSSSSttRSSSRRCsCC,\r\n" + //
        "                                      cSSssSSSsSssSSSASSsssCsSSSSSssSscsSSSSSsCSSsCsSS           tRsSSS\r\n" + //
        "                                    sSSSCsSSsSsSsSSSSSSSASSsSSSSSSCscssSstCCsssCCsSS,               ,\r\n" + //
        "                                 ,CCSSsCsSSSSSssSSSSSssSscssStsSSSssssssssSSCCsssCc\r\n" + //
        "                           cSsRRRssAtssSSsSRSSSssCSSsCSSSSSsssSssssssSSSSsSssCCsss\r\n" + //
        "                      ,CSSSSSsSsSsSS,cSSSSsSSSSssCssSSSSSSSSsSsctsSSSRSSssCCCCCssS\r\n" + //
        "                 cSRRRRSsssSRSRRRRRRRRRRRRRRRSSSRRSssRRRSSSssCCssSSsSSRSssCCCssSRs\r\n" + //
        "              ,cs,  ,SRt,SS         ,RRRRRRRRSRRRSSCc  SRRRRSSSSASASSSRRSRSssSscCCC,\r\n" + //
        "                                      RRRRRRRRRRRRSSCc         ,,,ttSSstSRRRSSSSSsSsCc\r\n" + //
        "                                       ,RRRRRR,  RRSSs,                           SRRSss,\r\n" + //
        "                                       ,RRRRR,    SRRRs                             cRSSRRS,\r\n" + //
        "                                       CCCCS       SSRS,                           ,,,    S,,\r\n" + //
        "                                     ssCCC           SRRSSs,                      ,,         ,,,\r\n" + //
        "                                     Sss,                ,SSScc,               ,CCC            ,sCC\r\n" + //
        "                                      SSc                   ,c,,,,C,           tCs              cRscc\r\n" + //
        "                                       Cs,                       ,CC,,,        t\r\n" + //
        "       , ,,,,,,,,,,,,,,, ,,,,c,,,,,,,,,,cccc,c,ccctctttctttttttttttttc,ttttc,ctc,tc,,,,,t,c,,,,,,,,,,,,,,\r\n" + //
        "     ,,,,,,,,cccccccccccccccccccCCCCCssCC,cCcCCsCCCCCCCCCCcCsssCssssCcccCcCCsCCcccccCccccccccccc,c,,,,,,,,,,,,\r\n" + //
        "                          , , , , , , , ,, ,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,, , , ,, , , ,  ,",
"                                                                           .,SAARRRRRRARRAcRRSs\r\n" + //
        "                                                                        cRAARRRASAASSASSSsssSssSA,\r\n" + //
        "                                                                     .SRRRRSSASSSAAASSSsSAAASAAAARA\r\n" + //
        "                                                                    cSSSSSSSSSSSSSSAASSAARRASSAASSSA\r\n" + //
        "                                                .,ctc,.  .,csSSSttSRASsSSASASAAASASAAAAASSAAASSARASSS\r\n" + //
        "                                      ,SAASSsssSSssASAASSAASSSAARASSASsARRRASASSSSSSSS         csSSSSAR,\r\n" + //
        "                                    SAAASsSASssSSSSSAAAAASSsSAASSSsSssssctSsSSSSsSSA              AAsA\r\n" + //
        "                                 ScSASSsSAAAsSSAARAASASAASAAAASASSAAASSssSSASsSSSSc\r\n" + //
        "                              cASsSASSsSAASSASsSRRAsSssSAASSAAAAAAASSSASSSSAAssssSs\r\n" + //
        "                    cSSSSSAASSASSARSSAAAASASSAAAARRAAASSsSSASSSSSsAsAAASSSSsssSSSA,\r\n" + //
        "             ,cc,SRSSSSSSSARSR,cSARRRRRRAASAASSSSsRRRRRAsstSSSAAScAASASASSSsSSsSRA\r\n" + //
        "            csccAARRRSAAc        ARRRRRRRRRAAAssSs   sRRRRASSSRAAsAASSARRRARASAAAss,\r\n" + //
        "                                 sRRRRRRRARRASsSAc          ,cscsSSAAAAAc,cSARRAAASASSSc\r\n" + //
        "                                 SRRRRRRRcARRRAss                                AAsSSRRAS\r\n" + //
        "                               cSscARR      RRAAs                                   SSASAc\r\n" + //
        "                             SSSSSS,         RAAA,                                    cRAc,\r\n" + //
        "                           ,SSs              cRRRc                                       ,cccc\r\n" + //
        "                           SAS               SAAAS                                       css,c, cc\r\n" + //
        "                          SSc                  ARAc                                      ccs    cAScS\r\n" + //
        "                         ccc                     sAS                                      ,\r\n" + //
        "          ,,,, ,,,,,,,,cc,cccccccccccccscscscscccscScccscccccccscccscsccssssccccscsccc,, ,,c,,,,,,,,,,,,, ,  ,\r\n" + //
        "    , ,,,ccccccccccccccSSSccssssSSsscssSsSSSssSssSSSsccsccccscssssscssssscsccscsccccccsccscccccccccccccccc,,,, ,\r\n" + //
        "                          ,   , , ,, , , ,, ,,,,,,,,, , , ,,,,,,,,,,,,,,,,,,,,, , , , ,  , ,",
"                                                                            ,csSASRRRRRRt  RS\r\n" + //
        "                                                                        ,tSSSAAARRAASSSRRSSRSSsC\r\n" + //
        "                                                                     ,SARRASSSsSsssSsCCsCCCsSSsSSt\r\n" + //
        "                                                                   ,CSSAASsCsCCCCCccSsCCSRSsSsSsRRS\r\n" + //
        "                                                               .cSSCsssstCcSCsSCSssSCssSRRRSsssSSsCS\r\n" + //
        "                                      ctsSSSSSSsCssSSCCSsstscSSASSSsSssSsCsSSSSsssCsSS,  ,cSSSSSRSCCcC\r\n" + //
        "                                 ,sSSSSSSCCCCCCsSSSsSsSSsssSSSsssCCctSsccCssssssCsSS            RStSSS,\r\n" + //
        "                              cSSsSssCCssSSCCSsSSsSSCsSSSSssSASCtsCtCcCsCsSSCCssss               ,t,,\r\n" + //
        "                            cSRRSsCCCsSSSsSsSSSASSSstCcCsSSsSSsCsSsssSSSSssSSsCcCs,\r\n" + //
        "                         cRRRRSSRSSSSSSsSSCsSSSRSASSsSSSSSSssSsCCsSSSSARSSssCssSsS\r\n" + //
        "             ,tSSSSSSssSSSRS CsSRRSSRRSSSsssSSSRRRRARSAASASSASSSscSsSSARRSSsSSCCsc\r\n" + //
        "             ctctSSst,,       RRRRRSSSRSSSSSSS,  ,tRRRRRRRSSSSSSSCSSRSssSRRSSSSSSCC,\r\n" + //
        "               ,             sRRRRRRSSSSSSSsS,          ,,csSSRRRRRRRRSs,,tRRSSRSsSSsC,\r\n" + //
        "                           ,RsSRRRctRSSSSsSS                                 SRRcCsSSsSSst\r\n" + //
        "                         cSsSSR,   ,SRSsCc                                    ,RRRc    tRRs,\r\n" + //
        "                       ssCCSs      SSSSS                                        tRRR      ,,,,\r\n" + //
        "                     cSSs       csRSSs                                             RRR       c,,\r\n" + //
        "                    cSs         RSSC                                                ,c,        csc,\r\n" + //
        "                   ,,,          ,RS                                                   c c      ,Rscs\r\n" + //
        "               , ,cc             ,SS                                                   ,,,\r\n" + //
        "        , , ,SsCCsC,,,,,,,c,,,,,,,ssS,,,,c,c,cc,,t,tctcttc,ccttttt,ct,,,,,,,,,,,,,,,,,,,,sSs,,,,,,,,,,,,,,, ,\r\n" + //
        "     ,,,,,,c,cccccccccccccccsssssssccccCcCCcCCCCCcCcCcCCcCcCCCcCccCccCcCcCCcCCCcccCccccccccCcccccc,,,,,,,,,,,, ,\r\n" + //
        "                     ,    ,  , , , ,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, , , , , , ,  ,  ,",
"                                                                                    ,ccCsc,  R,\r\n" + //
        "                                                                           ,cCSSCCARRRRRRRRRssRAAc\r\n" + //
        "                                                                        cARAAAsSSSSsSSAAASSSSCCCSSAc\r\n" + //
        "                                                                    .,cSRAASSSSSSSSSSSSCSSSAAAAAAAARS\r\n" + //
        "                                                                ,cCARRRRASSSSsSSSsSSAASsAARAAAASAASCAA,\r\n" + //
        "                                  ,cSSAAASSSSSSSsCCCCCCssCCCcsSSSSCSRASSCCSASSASASSSSSSSAS,CAAAAAARASSSS\r\n" + //
        "                               ,AASSCCCSSSSCCcSSAAACCSASCCsSSSSASSSSSCCCCsCsAASSSSSSSAAA       ,cSCSSsCsS,\r\n" + //
        "                            ,ARRSSCCSSAASASCCSASSSscsSCCcSSAAAAASsSASCcCsSASCSSSSSSSRA              AsSAs\r\n" + //
        "                           RAARRAAAAAAAAAASSCAAASAASAACCSSSSSSASCSASSsSssASSSCCSSSSS\r\n" + //
        "                        ,ARRRR,,AAAAAAAAAsSAARSSSSSSASSCAASSSSSSsSACSAAARSSSAAASCCA,\r\n" + //
        "                    .CAARRRRc  CRARAAASSSCARRRAASASCSSASASSSASSSsSSSSSSRRRAAASSCSSSC\r\n" + //
        "            cSAARSARARRAA      cRAAAAAAAAAARS,  ,cARRRRASAASSSSSSSSAAAAAsARRAAAASCS,\r\n" + //
        "            SRARARARARs,     sARRRAARAASSc             cARRRRRRRSSsSSssAASCARRSAAAASCc,\r\n" + //
        "                        ,SSSSAARAARRAAA,                        ,,,,CssssSc,RRRRRRAASASCs,\r\n" + //
        "                       ,SSCSRAAAAAAc                                          RRRR   CAAAAAs,\r\n" + //
        "                     ,AARCASARARR,                                            cRRRc       RRAC,\r\n" + //
        "                   ,,A,   RAA,                                                  SCS           ,,,,\r\n" + //
        "                 ,,c,    SRC                                                     RA,             ccC,\r\n" + //
        "             ,Cccc      ,AR                                                      ,RA                Ccc\r\n" + //
        "             ,          ,,                                                         c,\r\n" + //
        "         , ,,,    ,,,,,c,,,    ,,,,,,         , , , , , ,  ,     ,                 ,,,\r\n" + //
        "     ,,,,,,,,,,,c,c,cccccCSCSSSSSSsCcCCCccCCCccccCCCSASASAASSSsSAASsCCSSSSAAASCcCccCc,,cCcCccCccCc,,,,,,,,  ,\r\n" + //
        "                            , , , , , , ,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,, ,,,, ,, , , ,  ,    ,",


                        
    };


    for (int i = 0; i < 100; i++) {
    ArteAscii.limpiarConsola();
    System.out.println("\n\n\n\n"+frames[i % frames.length]);
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
        
    }
    @Override
    public void mostrarFicha(Usuario user) {
        ArteAscii.imprimirCabecera(user);
        String esFav ="❌";
        String punt = ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "P" +ArteAscii.RESET + "untúa este contenido";
        
        for (int idContUsu : user.getFavoritos()) {
            if(idContUsu == this.getIdCont()){
                esFav= "❤️";
                break;
            }
        }
        for (int idContUsu : user.getPuntuaciones()) {
            if(idContUsu == this.getIdCont()){
                punt = "Ya has puntuado este contenido, gracias! 👌";
                break;
            }
        }
        String estrellas =" ";
        for (int i = 0; i < getPuntuacion().intValue(); i++) {
            estrellas = estrellas + "⭐";
        }

        System.out.println("\n\t\t\t\t\t\t\t"+ArteAscii.FONDO_AZUL+ArteAscii.BLANCO+" ---     "+getTitulo().toUpperCase()+"     --- \n"+ArteAscii.RESET+
                            "\n                     . . . . . . . . . . . . . . .                    \n" +
                            "                 ;$&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&$;.                \t---------------------------------------------------------------\n"+
                            "               .$&&x;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;x$&$.               "+ArteAscii.AZUL_CLARO+"\t\tDIRECTOR - "+ArteAscii.RESET +getDirector()+"\n"+
                            "               &&$"+ArteAscii.AMARILLO+"                ..                "+ArteAscii.RESET+"x&&               \t---------------------------------------------------------------\n"+
                            "               &&$"+ArteAscii.AMARILLO+"               ....               "+ArteAscii.RESET+"x&&               "+ArteAscii.AZUL_CLARO + "\t\tGÉNERO - "+ArteAscii.RESET +getGenero()+"\n"+
                            "               &&$"+ArteAscii.AMARILLO+"              ......              "+ArteAscii.RESET+"x&&               \t---------------------------------------------------------------\n"+
                            "               &&$"+ArteAscii.AMARILLO+"         ................         "+ArteAscii.RESET+"x&&               "+ArteAscii.AZUL_CLARO+"\t\tFECHA ESTRENO - "+ArteAscii.RESET +getFechaCreacion()+"\n"+
                            "               &&$"+ArteAscii.AMARILLO+"            ..........            "+ArteAscii.RESET+"x&&               \t---------------------------------------------------------------\n"+
                            "               &&$"+ArteAscii.AMARILLO+"             ........             "+ArteAscii.RESET+"x&&               "+ArteAscii.AZUL_CLARO+"\t\tEN DAWFLIX DESDE - "+ArteAscii.RESET +getFechaAltaSistema()+"\n"+
                            "               &&$"+ArteAscii.AMARILLO+"            ....  ....            "+ArteAscii.RESET+"x&&               \t---------------------------------------------------------------\n"+
                            "               &&$"+ArteAscii.AMARILLO+"           ..        ..           "+ArteAscii.RESET+"x&&               "+ArteAscii.AZUL_CLARO+"\t\tDURACIÓN -  "+ArteAscii.RESET +getDuracion()+" MIN\n"+
                            "               &x;                                  ;x$               \t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"                 .;;;;;;.      .;;;;;;.      .;;;;;;.                 "+ArteAscii.AZUL_CLARO+"\t\tFAVORITO "+ArteAscii.RESET +esFav+"\n"+
                            ArteAscii.AZUL_CLARO+"               ;&&&&&&&&&$.  .$&&&&&&&&$;  .$&&&&&&&&&;               "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"              .&&&&&&&&&&&$  &&&&&&&&&&&&  $&&&&&&&&&&&.              "+ArteAscii.AZUL_CLARO+"\t\tPUNTUACIÓN "+ArteAscii.RESET +getPuntuacion()+" "+ estrellas + " - (" + getNumValoraciones() + ") valoraciones\n"+
                            ArteAscii.AZUL_CLARO+"               .......;x$&$  x;........;x  $&&x;.......               "+ArteAscii.RESET+"\n"+
                            ArteAscii.AZUL_CLARO+"             ;;xxxxxx;;  ;x   ;;xxxxxx;;   $;  ;;xxxxxx;;             "+ArteAscii.AZUL_CLARO+"\t\t"+ punt +"\n"+
                            ArteAscii.AZUL_CLARO+"           ;&&&&&&&&&&&&;   ;&&&&&&&&&&&&;   ;&&&&&&&&&&&&;           "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"          .$&&&&&&&&&&&&&.  &&&&&&&&&&&&&&. .&&&&&&&&&&&&&&.          "+ArteAscii.AZUL_CLARO+"\t\tTIPO DE CONTENIDO - "+ArteAscii.RESET +getTipoSuscripcion()+"\n"+
                            ArteAscii.AZUL_CLARO+"          .&&&&&&&&&&&&&&. .&&&&&&&&&&&&&&. .&&&&&&&&&&&&&&;          "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"          .&&&&&&&&&&&&&&. .&&&&&&&&&&&&&&. .&&&&&&&&&&&&&&.          "+ArteAscii.AZUL_CLARO+"\t\tCALIFICACIÓN - +"+ArteAscii.RESET +getControlParental()+"\n"+
                            "           ..............   ..............   ..............           " + ArteAscii.RESET+"\t---------------------------------------------------------------\n" +
                            "\t--------------------------------------------------------------------\n" +
                            ArteAscii.AZUL_CLARO+"\t\tDESCRIPCIÓN - "+ArteAscii.RESET +getDescripcion()+"\n");
        ArteAscii.imprimirPieContenido();

    }
    public void datosRecomendados() {
        String estrellas =" ";
        for (int i = 0; i < getPuntuacion().intValue(); i++) {
            estrellas = estrellas + "⭐";
        }
        System.out.println("\t\t\t\t"+ ArteAscii.AZUL_CLARO +"-------------------------------------------------------------------------------------------------" + ArteAscii.RESET);
        System.out.println("\t\t\t\t\t\t\t📽️ " + getTitulo() + estrellas + " " + getPuntuacion());
    }

}
