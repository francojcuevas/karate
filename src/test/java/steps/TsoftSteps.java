package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TsoftPage;
import pages.PartnerPage;
import pages.InspiracionPage;

public class TsoftSteps {
    TsoftPage tsoftPage = new TsoftPage();
    InspiracionPage inspiracionPage = new InspiracionPage();
    PartnerPage partnerPage = new PartnerPage();

    @Given("Ingresar a la pagina")
    public void ingresarAwebapp() {
        System.out.println("ingreso a Tsoft");
        tsoftPage.dirigirseASitioWeb();
    }
    //1° Escenario
    @When("selecciono proximo eventos")
    public void seleccionoEventos() {
        tsoftPage.clickEventos();
    }
    @And("se visualiza los proximos eventos de tsoft")
    public void muestraPaginaClientes(){
        tsoftPage.dirigirseASitioEventos();
    }

    @Then("vuelvo a home")
    public void vuelvoHome(){
        tsoftPage.dirigirseASitioWeb();
    }

    //2° Escenario

    @When("selecciono inspiracion")
    public void muestraPaginaInspiracion() {
        tsoftPage.dirigirseASitioWebInspiracion();
    }
    @And("se selecciona articulos de expertos")
        public void seleccionArticulosExpertos(){
        inspiracionPage.seleccionExpertos();
    }
    @Then("se elige el articulo super analista")
    public void seleccionArticuloAnalista(){
        inspiracionPage.seleccionArticuloAnalista();
    }

    //3° Escenario

    @When("se elige partners")
    public void muestraPaginaPartners(){tsoftPage.dirigirseASitioPartners();}

    @And ("se selecciona Attlasian")
    public void clikearAtlassian(){partnerPage.clickAtlassian();}

    @Then ("se clickea el boton decubrelo aqui")
    public void clikearAtlassianVerMas(){partnerPage.dirigirseASitioAttlasianReconocimiento();}
}

