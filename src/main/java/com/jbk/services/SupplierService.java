package com.jbk.services;

import com.jbk.models.SupplierModel;

public interface SupplierService {

	public boolean addSupplier(SupplierModel supplierModel);

	public SupplierModel getSupplierById(long supplierId);

	public boolean updateSupplier(SupplierModel supplierModel);

}
