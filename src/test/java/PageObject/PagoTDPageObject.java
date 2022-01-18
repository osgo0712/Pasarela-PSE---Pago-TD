package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;


@DefaultUrl ("https://www.colsubsidio.com/ssoc/#/ingresar?goto=http:%2F%2F40.117.63.112%2Fportal%2Fsalud")

public class PagoTDPageObject extends PageObject {


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	Properties loadProperty = new Properties();	
	
	//HOME
	static By User = PagoTDElements.txtUser.getValor_campo();
	static By Pass = PagoTDElements.txtPass.getValor_campo();
	static By Ing = PagoTDElements.btningreso.getValor_campo();
	static By Servicio = PagoTDElements.btnserv.getValor_campo();
	static By Ingreso = PagoTDElements.btningresarportal.getValor_campo();
	//AGENDAR CITA
	static By Agendar = PagoTDElements.btnagendar.getValor_campo();
	//TIPO DE CITA
	static By TipoCita = PagoTDElements.btntipocita.getValor_campo();
	static By CitaPresencial = PagoTDElements.btncitapresencial.getValor_campo();
	//SELECCION DE CIUDAD
	static By Ciudad = PagoTDElements.btnciudad.getValor_campo();
	static By Bogota = PagoTDElements.btnBogota.getValor_campo();
	static By ConfirmarCiudad = PagoTDElements.btnconfirmarciudad.getValor_campo();
	//SELECCION CENTRO MEDICO
	static By CentroMedico = PagoTDElements.btncentromedico.getValor_campo();
	static By CentroMedicoSuba = PagoTDElements.btncentromedicosuba.getValor_campo();
	static By Horario = PagoTDElements.btnhorario.getValor_campo();
	static By ConfirmarHorario = PagoTDElements.btnconfirmarhora.getValor_campo();
	//SELECCION FECHA
	static By Fecha = PagoTDElements.btnfecha.getValor_campo();
	static By ValidacionDisponibilidad = PagoTDElements.txtValidacionDisponibilidad.getValor_campo();
	static By Atras = PagoTDElements.btnAtras.getValor_campo();
	static By Hora = PagoTDElements.btnconfirmarhora.getValor_campo();
	static By Medico = PagoTDElements.btnmedico.getValor_campo();
	static By ConfirmarFecha = PagoTDElements.btnconfirmarfecha.getValor_campo();
	//ConfirmarReserva
	static By ConfirmarReserva = PagoTDElements.btnconfirmarreserva.getValor_campo();
	//PAGO
	static By BtnCitasAegndadas = PagoTDElements.btnCitasAgendadas.getValor_campo();
	static By BtnPagarCitaAgendada = PagoTDElements.btnPagarCitaAgendada.getValor_campo();
	static By BtnIconoPago = PagoTDElements.btnIcono.getValor_campo();
	static By TxtCel = PagoTDElements.txtCel.getValor_campo();
	static By TxtEmail = PagoTDElements.txtemail.getValor_campo();
	static By Captchat = PagoTDElements.btnCaptchat.getValor_campo();
	static By BtnConfirmarDatos = PagoTDElements.btnPagar.getValor_campo();
	static By BtnPSE = PagoTDElements.btnPSE.getValor_campo();
	static By MsjCreacion = PagoTDElements.MnsjCreacion.getValor_campo();
	//TIPO PERSONA
	static By BtnTipoPersona = PagoTDElements.btnTipoPersona.getValor_campo();
	static By BtnPersonaNatural = PagoTDElements.btnPersonaNatural.getValor_campo();
	static By BtnBanco = PagoTDElements.btnBanco.getValor_campo();
	static By BtnBancoUnionColombiano = PagoTDElements.btnBancoUnionColombia.getValor_campo();
	static By BtnContinuarPago = PagoTDElements.btnContinuarPago.getValor_campo();
	//EMAIL PSE
	static By TxtEmailPSE = PagoTDElements.txtEamilPSE.getValor_campo();
	static By BtnAceptar = PagoTDElements.btnAceptar.getValor_campo();
	static By BtnIrBanco = PagoTDElements.btnIrBanco.getValor_campo();
	//INFORMACION PAGO
	static By TxtAegncia = PagoTDElements.btnAgency.getValor_campo();
	static By TxtAccount = PagoTDElements.btnAccount.getValor_campo();
	static By TxtPass = PagoTDElements.btnPass.getValor_campo();
	static By BtnCheck = PagoTDElements.btncheckout.getValor_campo();
	static By BtnPay = PagoTDElements.btnPay.getValor_campo();
	static By MsjAprobado = PagoTDElements.MnsjAprobado.getValor_campo();



	public void ClickAgendar() throws InterruptedException, AWTException {
			Thread.sleep(1000);
			find(User).click();
			find(User).sendKeys("53084100");
			Thread.sleep(1000);	
			find(Pass).click();
			find(Pass).sendKeys("Mafe2408");
			Thread.sleep(1500);	
			find(Ing).click();
			Thread.sleep(5000);	
			find(Servicio).click();
			Thread.sleep(1000);	
			find(Ingreso).click();
			Thread.sleep(3000);	
		//REFRESCAR PAGINA	
			
			if (element(Agendar).isVisible()) {
				find(Agendar).click();
				Thread.sleep(3000);	
			}else {
				System.out.println("Pagina refrescada");
				getDriver().navigate().refresh();
				Thread.sleep(2000);
			}
				
	}

	public void TipoCita() throws InterruptedException {
		find(TipoCita).click();
		Thread.sleep(2000);	
		find(CitaPresencial).click();
		Thread.sleep(4000);	
		
	}

	public void SeleccionarCiudad() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		find(Ciudad).click();
		Thread.sleep(1000);
		find(Bogota).click();
		Thread.sleep(1000);
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyPress(KeyEvent.VK_ENTER);
		if (element(ConfirmarCiudad).isVisible()) {
			find(ConfirmarCiudad).click();
			Thread.sleep(1000);	
		}else {
			System.out.println("Pagina refrescada");
			getDriver().navigate().refresh();
			Thread.sleep(2000);
		}
	}
		
	
	public void SeleccionCentroMedico() throws InterruptedException, AWTException {
		find(CentroMedico).click();
		Thread.sleep(1000);
		find(CentroMedicoSuba).click();
		Thread.sleep(1000);	
		find(Horario).click();
		Thread.sleep(1000);	
		find(ConfirmarHorario).click();
		Thread.sleep(1000);	

	}

	public void SeleccionFecha() throws AWTException, InterruptedException {

		Robot robot = new Robot();	
			Thread.sleep(1000);	
			find(Fecha).click();
			Thread.sleep(3000);		
			//HORA
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			//MEDICO
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			find(ConfirmarFecha).click();
			Thread.sleep(3000);
		
	}

	public void ConfirmarReserva() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		find(ConfirmarReserva).click();
		Thread.sleep(9000);

	}

	public void CitaAgendada() throws InterruptedException {
		if(element(BtnCitasAegndadas).isDisplayed()) {		
			Thread.sleep(1000);
			if (element(BtnCitasAegndadas).isVisible()) {
				find(BtnCitasAegndadas).click();
				Thread.sleep(3000);	
			}else {
				System.out.println("Pagina refrescada");
				getDriver().navigate().refresh();
			}
		}
	}

	public void ClickBtnPagar() throws InterruptedException {


		String mainTab = getDriver().getWindowHandle();
		String newTab = "";	
		System.out.println("Main Tab" + mainTab);
		find(BtnPagarCitaAgendada).click();
		Thread.sleep(2000);

		Set<String> handles = getDriver().getWindowHandles();
		for (String actual : handles) {
			System.out.println("Handle id:" + actual);	
			if (!actual.equalsIgnoreCase(mainTab)) {
				//Cambio de Pestaña
				getDriver().switchTo().window(actual);
			}
		}

	}


	public void RegistrarDatos()  {
		try {
			//Robot robot = new Robot();
			find(BtnIconoPago).click();
			Thread.sleep(2000);
			find(TxtCel).sendKeys("3104985492");
			Thread.sleep(1000);
			find(TxtEmail).sendKeys("Test@gmail.com");
			Thread.sleep(2000);
			getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id=\"ngrecaptcha-0\"]/div/div/iframe")));
			Thread.sleep(1000);
			find(Captchat).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			getDriver().switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

	public void ConfirmarDatos() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		find(BtnConfirmarDatos).click();	
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		find(BtnPSE).click();	
		Thread.sleep(2000);
	}

	public void ValidarMensajeCreacion() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);

	}

	public void RegistroDatosPago() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,500)");
		find(BtnTipoPersona).click();
		Thread.sleep(2000);
		find(BtnPersonaNatural).click();
		Thread.sleep(2000);
		find(BtnBanco).click();
		Thread.sleep(2000);
		find(BtnBancoUnionColombiano).click();
		Thread.sleep(2000);
		find(BtnContinuarPago).click();
		Thread.sleep(3000);

	}

	public void IngresoEmailPSE() throws InterruptedException {

		find(TxtEmailPSE).sendKeys("oscaesgo@colsubsidio.com");
		Thread.sleep(2000);
		find(BtnAceptar).click();
		Thread.sleep(1000);
		find(BtnIrBanco).click();
		Thread.sleep(2000);
	}

	public void InformacionTD() throws InterruptedException {
		find(TxtAegncia).sendKeys("1234");
		Thread.sleep(2000);
		find(TxtAccount).sendKeys("1234");
		Thread.sleep(2000);
		find(TxtPass).sendKeys("12345");
		Thread.sleep(2000);
		find(BtnCheck).click();
		Thread.sleep(2000);
	}

	public void RealizarPago() throws InterruptedException {
		find(BtnPay).click();
		Thread.sleep(5000);
	}

	public void ValidarMensajeAprobacion() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);		
	}

}