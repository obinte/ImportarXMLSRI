/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.ImportarXMLSRI.service;

import com.acosux.ImportarXMLSRI.util.RespuestaWebTO;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Carol
 */
@Service
public class ComprobantesElectronicoServiceImpl implements ComprobantesElectronicoService {

    private final RestTemplate restTemplate = new RestTemplate();
    @Value("${acosux.endpoint}")
    private String ENDPOINT;

    @Override
    public RespuestaWebTO insertarComprobantesElectronicosEmitidosLote(Map<String, Object> map) throws Exception {
        RespuestaWebTO respuesta = null;
        respuesta = restTemplate.postForObject(ENDPOINT + "/todocompuWS/anexosWebController/insertarComprobantesEmitidosLote",
                map, RespuestaWebTO.class);
        return respuesta;
    }

    @Override
    public RespuestaWebTO insertarComprobantesElectronicosRecibidosLote(Map<String, Object> map) throws Exception {
        RespuestaWebTO respuesta = null;
        respuesta = restTemplate.postForObject(ENDPOINT + "/todocompuWS/anexosWebController/insertarComprobantesRecibidosLote",
                map,
                RespuestaWebTO.class);
        return respuesta;
    }

}
