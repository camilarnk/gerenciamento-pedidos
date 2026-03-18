package com.bn.orders.services;

import com.bn.orders.models.PedidoModel;
import com.bn.orders.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel criarPedido(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public List<PedidoModel> buscarTodosPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

}