/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class AvisoMain {
    public static void main (String args[]){

Aviso sc =new Aviso();
sc.titulo="Insumos y bienes muebles de laboratorio disponibles";
sc.Nombre=" Eduardo Flores Díaz";
sc.texto="La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, pone a disposición del personal que realiza investigación el inventario adjunto.";
sc.resumen="Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)";
sc.fechapublicacion = "02/02/2020" ;
sc.fechabaja =":02/02/2020";
sc.fechaalta =" 02/02/2021";
sc.status ="vigente";
sc.Tipoaviso="General";

System.out.println(sc.toString());

Aviso scc=new Aviso();
scc.titulo="CONFERENCIA DR. COSSARIZZA";
scc.Nombre="Kevin Meza Gonzalez";
scc.texto="El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced Cytometry” y aprovechó la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de investigación, aún no publicados, sobre VIH y el uso de citometría de flujo.\n" +
"\n" +
"Además, invitó a nuestra comunidad a agregarse a la sociedad internacional sobre citometría: ISAC(International Society for the Advancement of Cytometry) y aprovechar los recursos que tienen como:\n" +
"\n" +
"Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas\n" +
"Iniciativa de innovación CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en productos comerciales de alto impacto para ayudar a nuevos empresarios a aprovechar la tecnología de citometría\n" +
"\n" +
"Además en la ISAC tienen disponibles una serie de manuales e información de punta sobre la citometría para uso libre. El Dr. Cossarizza reiteró la invitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando el prestigio que tiene el Laboratorio de Citometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.";
scc.resumen="Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry\"";
sc.fechapublicacion = ":02/03/2020";

sc.fechabaja ="15/02/2020";
sc.fechaalta ="31/03/2020";
sc.status ="No vigente";

scc.Tipoaviso="Conferencia";

System.out.println(scc.toString());

}    
    
}
