package com.persistent.searchservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MasterVariant")
public class MasterVariant {

	@Id
	private String chrom_start_stop_ref_alt;
	private String soi_hgvs;
	private String pgx_hgvs;
	private String gene;
	private String gene_url;
	private String transcript;
	private String cdna;
	private String protein;
	private String zygosity;
	public String getChrom_start_stop_ref_alt() {
		return chrom_start_stop_ref_alt;
	}
	public void setChrom_start_stop_ref_alt(String chrom_start_stop_ref_alt) {
		this.chrom_start_stop_ref_alt = chrom_start_stop_ref_alt;
	}
	public String getSoi_hgvs() {
		return soi_hgvs;
	}
	public void setSoi_hgvs(String soi_hgvs) {
		this.soi_hgvs = soi_hgvs;
	}
	public String getPgx_hgvs() {
		return pgx_hgvs;
	}
	public void setPgx_hgvs(String pgx_hgvs) {
		this.pgx_hgvs = pgx_hgvs;
	}
	public String getGene() {
		return gene;
	}
	public void setGene(String gene) {
		this.gene = gene;
	}
	public String getGene_url() {
		return gene_url;
	}
	public void setGene_url(String gene_url) {
		this.gene_url = gene_url;
	}
	public String getTranscript() {
		return transcript;
	}
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
	public String getCdna() {
		return cdna;
	}
	public void setCdna(String cdna) {
		this.cdna = cdna;
	}
	public String getProtein() {
		return protein;
	}
	public void setProtein(String protein) {
		this.protein = protein;
	}
	public String getZygosity() {
		return zygosity;
	}
	public void setZygosity(String zygosity) {
		this.zygosity = zygosity;
	}
	
}
