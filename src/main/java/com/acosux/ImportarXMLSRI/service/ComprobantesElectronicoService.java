/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.ImportarXMLSRI.service;

import com.acosux.ImportarXMLSRI.util.RespuestaWebTO;
import java.util.Map;

/**
 *
 * @author Carol
 */
public interface ComprobantesElectronicoService {

    public RespuestaWebTO insertarComprobantesElectronicosEmitidosLote(Map<String, Object> map) throws Exception;

    public RespuestaWebTO insertarComprobantesElectronicosRecibidosLote(Map<String, Object> map) throws Exception;
}
