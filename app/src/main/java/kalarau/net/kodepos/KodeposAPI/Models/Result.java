
package kalarau.net.kodepos.KodeposAPI.Models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Result {

    private String Id;
    private String kodepos;
    private String provinsi;
    private String kabupaten;
    private Object kota;
    private String kecamatan;
    private String kelurahan;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param kecamatan
     * @param provinsi
     * @param kodepos
     * @param Id
     * @param kota
     * @param kelurahan
     * @param kabupaten
     */
    public Result(String Id, String kodepos, String provinsi, String kabupaten, Object kota, String kecamatan, String kelurahan) {
        this.Id = Id;
        this.kodepos = kodepos;
        this.provinsi = provinsi;
        this.kabupaten = kabupaten;
        this.kota = kota;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
    }

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public Result withId(String Id) {
        this.Id = Id;
        return this;
    }

    /**
     * 
     * @return
     *     The kodepos
     */
    public String getKodepos() {
        return kodepos;
    }

    /**
     * 
     * @param kodepos
     *     The kodepos
     */
    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    public Result withKodepos(String kodepos) {
        this.kodepos = kodepos;
        return this;
    }

    /**
     * 
     * @return
     *     The provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * 
     * @param provinsi
     *     The provinsi
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Result withProvinsi(String provinsi) {
        this.provinsi = provinsi;
        return this;
    }

    /**
     * 
     * @return
     *     The kabupaten
     */
    public String getKabupaten() {
        return kabupaten;
    }

    /**
     * 
     * @param kabupaten
     *     The kabupaten
     */
    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public Result withKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
        return this;
    }

    /**
     * 
     * @return
     *     The kota
     */
    public Object getKota() {
        return kota;
    }

    /**
     * 
     * @param kota
     *     The kota
     */
    public void setKota(Object kota) {
        this.kota = kota;
    }

    public Result withKota(Object kota) {
        this.kota = kota;
        return this;
    }

    /**
     * 
     * @return
     *     The kecamatan
     */
    public String getKecamatan() {
        return kecamatan;
    }

    /**
     * 
     * @param kecamatan
     *     The kecamatan
     */
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public Result withKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
        return this;
    }

    /**
     * 
     * @return
     *     The kelurahan
     */
    public String getKelurahan() {
        return kelurahan;
    }

    /**
     * 
     * @param kelurahan
     *     The kelurahan
     */
    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public Result withKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
