/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.ImportarXMLSRI.controller;

import com.acosux.ImportarXMLSRI.service.ComprobantesElectronicoService;
import com.acosux.ImportarXMLSRI.util.RespuestaWebTO;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carol
 */
@RestController
@RequestMapping("/comprobantesElectronico/")
public class ComprobantesElectronicoController {

    @Autowired
    ComprobantesElectronicoService comprobantesElectronicoService;

    @RequestMapping(value = "/insertarComprobantesElectronicosLote", method = {RequestMethod.POST})
    public RespuestaWebTO insertarComprobantesElectronicosLote(@RequestBody Map<String, Object> map) {
        RespuestaWebTO resp = new RespuestaWebTO();
        resp.setEstadoOperacion(RespuestaWebTO.EstadoOperacionEnum.ADVERTENCIA.getValor());
        try {
            RespuestaWebTO respues = comprobantesElectronicoService.insertarComprobantesElectronicosEmitidosLote(map);
            if (respues != null) {
                return respues;
            } else {
                resp.setOperacionMensaje("Hubo un error al intentar guardar ");
            }
        } catch (Exception e) {
            resp.setEstadoOperacion(RespuestaWebTO.EstadoOperacionEnum.ERROR.getValor());
            resp.setOperacionMensaje(e.getMessage());
        }
        return resp;
    }

    @RequestMapping(value = "/insertarComprobantesElectronicosRecibidosLote", method = {RequestMethod.POST})
    public RespuestaWebTO insertarComprobantesElectronicosRecibidosLote(@RequestBody Map<String, Object> map) {
        RespuestaWebTO resp = new RespuestaWebTO();
        resp.setEstadoOperacion(RespuestaWebTO.EstadoOperacionEnum.ADVERTENCIA.getValor());
        try {
            RespuestaWebTO respues = comprobantesElectronicoService.insertarComprobantesElectronicosRecibidosLote(map);
            if (respues != null) {
                return respues;
            } else {
                resp.setOperacionMensaje("Hubo un error al intentar guardar ");
            }
        } catch (Exception e) {
            resp.setEstadoOperacion(RespuestaWebTO.EstadoOperacionEnum.ERROR.getValor());
            resp.setOperacionMensaje(e.getMessage());
        }
        return resp;
    }
}
