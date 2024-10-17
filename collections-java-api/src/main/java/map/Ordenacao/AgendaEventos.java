package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> eventosMap;

    public AgendaEventos(){ 
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: "+proximoEvento.getNome()+" acontecerá na data: "+ proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, 10, 25), "Festa de Aniversário", "DJ Fulano");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 15), "Show de Rock", "Banda Tal");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 5), "Feira Cultural", "Artistas Locais");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 12, 20), "Festival Gastronômico", "Chefs Famosos");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 1, 10), "Conferência de Tecnologia", "Palestrantes Internacionais");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
