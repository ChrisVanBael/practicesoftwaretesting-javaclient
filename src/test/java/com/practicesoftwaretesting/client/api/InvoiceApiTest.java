/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 0.4.0
 * Contact: info@testsmith.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.practicesoftwaretesting.client.api;

import com.practicesoftwaretesting.client.model.InlineResponse200;
import com.practicesoftwaretesting.client.model.InlineResponse2003;
import com.practicesoftwaretesting.client.model.InlineResponse401;
import com.practicesoftwaretesting.client.model.InlineResponse404;
import com.practicesoftwaretesting.client.model.InlineResponse4041;
import com.practicesoftwaretesting.client.model.InlineResponse405;
import com.practicesoftwaretesting.client.model.InvoiceRequest;
import com.practicesoftwaretesting.client.model.InvoiceResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for InvoiceApi
 */
@Ignore
public class InvoiceApiTest {

    private final InvoiceApi api = new InvoiceApi();

    /**
     * Delete specific invoice
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceTest() throws Exception {
        Integer invoiceId = null;
        api.deleteInvoice(invoiceId);

        // TODO: test validations
    }
    /**
     * Retrieve specific invoice
     *
     * Retrieve specific invoice
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInvoiceTest() throws Exception {
        Integer invoiceId = null;
        InvoiceResponse response = api.getInvoice(invoiceId);

        // TODO: test validations
    }
    /**
     * Retrieve all invoices
     *
     * &#x60;user&#x60; retrieves only related invoices
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInvoicesTest() throws Exception {
        InlineResponse2003 response = api.getInvoices();

        // TODO: test validations
    }
    /**
     * Retrieve specific invoices matching the search query
     *
     * Search is performed on the &#x60;invoice_number&#x60;, &#x60;billing_address&#x60; and &#x60;status&#x60; column
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchInvoiceTest() throws Exception {
        String q = null;
        InlineResponse2003 response = api.searchInvoice(q);

        // TODO: test validations
    }
    /**
     * Store new invoice
     *
     * Store new invoice
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storeInvoiceTest() throws Exception {
        InvoiceRequest body = null;
        InvoiceResponse response = api.storeInvoice(body);

        // TODO: test validations
    }
    /**
     * Update specific invoice
     *
     * Update specific invoice
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceTest() throws Exception {
        InvoiceRequest body = null;
        Integer invoiceId = null;
        InlineResponse200 response = api.updateInvoice(body, invoiceId);

        // TODO: test validations
    }
    /**
     * Update invoice status
     *
     * Update invoice status
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceStatusTest() throws Exception {
        InvoiceRequest body = null;
        Integer invoiceId = null;
        InlineResponse200 response = api.updateInvoiceStatus(body, invoiceId);

        // TODO: test validations
    }
}
