/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.ImportarXMLSRI.util;

/**
 *
 * @author Carol
 */
public class ComprobanteImportarTO {

    String claveAcceso;
    String xml;

    public ComprobanteImportarTO(String claveAcceso, String xml) {
        this.claveAcceso = claveAcceso;
        this.xml = xml;
    }

    public ComprobanteImportarTO() {
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

}
