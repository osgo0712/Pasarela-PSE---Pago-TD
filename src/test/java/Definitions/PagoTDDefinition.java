package Definitions;

import Steps.PagoTDStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PagoTDDefinition {
	
	@Steps
	PagoTDStep AgendamientoStep;
	
	@Given("^El usuario se encuentra en el portal salud de colsubsidio$")
	public void el_usuario_se_encuentra_en_el_portal_salud_de_colsubsidio() throws Throwable {
		AgendamientoStep.abrirHome();
	}

	@When("^Hace click en opcion de agendar cita$")
	public void hace_click_en_opcion_de_agendar_cita() throws Throwable {
		AgendamientoStep.Agenda();
	}

	@When("^Selecciona opcion de medicina general y hace click en atencion presencial$")
	public void selecciona_opcion_de_medicina_general_y_hace_click_en_atencion_presencial() throws Throwable {
		AgendamientoStep.TipoCita();
	}

	@When("^Selecciona la ciudad y hace click en boton siguiente$")
	public void selecciona_la_ciudad_y_hace_click_en_boton_siguiente() throws Throwable {
		AgendamientoStep.SeleccionCiudad();
	}

	@When("^Selecciona el centro medico, la zona horaria y hace click en boton siguiente$")
	public void selecciona_el_centro_medico_la_zona_horaria_y_have_click_en_boton_siguiente() throws Throwable {
		AgendamientoStep.SeleccionCentroMedico();
	}

	@When("^Selecciona el dia, hora, medico y hace click en boton siguiente$")
	public void selecciona_el_dia_hora_medico_y_hace_click_en_boton_siguiente() throws Throwable {
		AgendamientoStep.SeleccionFecha();
	}

	@When("^Confirma cita medica$")
	public void confirma_cita_medica() throws Throwable {
		AgendamientoStep.ConfirmarReserva();
	}
	
	@When("^El usuario hace click en boton citas agendadas$")
	public void el_usuario_hace_click_en_boton_citas_agendadas() throws Throwable {
		AgendamientoStep.CitasAgendadas();
	}

	@When("^Hace click en el boton de pago$")
	public void hace_click_en_el_boton_de_pago() throws Throwable {
		AgendamientoStep.ClickBtnPago();
	}

	@When("^Ingresa numero de telefono, email y validacion de captchat$")
	public void ingresa_numero_de_telefono_email_y_validacion_de_captchat() throws Throwable {
		AgendamientoStep.RegistroInfor();
	}

	@When("^Hace click en boton siguiente y boton pse$")
	public void hace_click_en_boton_siguiente_y_boton_pse() throws Throwable {
		AgendamientoStep.ConfirmacionDatos();
	}

	@When("^Hace confirmacion de mensaje de creacion de la transaccion$")
	public void hace_confirmacion_de_mensaje_de_creacion_de_la_transaccion() throws Throwable {
		AgendamientoStep.ValidarMensajeCreacion();
	}

	@When("^Selecciona tipo de cliente natural, tipo de identidad bancounion y hace click en boton continuar$")
	public void selecciona_tipo_de_cliente_natural_tipo_de_identidad_bancounion_y_hace_click_en_boton_continuar() throws Throwable {
		AgendamientoStep.DatosDePago();
	}

	@When("^Ingresa Email y Hace click en boton ir al banco$")
	public void ingresa_Email_y_Hace_click_en_boton_ir_al_banco() throws Throwable {
		AgendamientoStep.IngresoEmail();
	}

	@When("^Selecciona opcion de debito, ingresa numero de cuenta, ingresa numero de agencia y contraseña$")
	public void selecciona_opcion_de_debito_ingresa_numero_de_cuenta_ingresa_numero_de_agencia_y_contraseña() throws Throwable {
		AgendamientoStep.IngresoInformacionTD();
	}

	@When("^Hace click en boton pay$")
	public void hace_click_en_boton_pay() throws Throwable {
		AgendamientoStep.RealizarPago();
	}

	@Then("^Transaccion en estado aprobada$")
	public void valida_mensaje_de_aprobacion_de_la_transaccion() throws Throwable {
		AgendamientoStep.MensajeAprobado();
	}
}
