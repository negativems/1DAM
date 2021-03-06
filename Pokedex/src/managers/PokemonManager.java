package managers;

import java.util.ArrayList;
import java.util.List;

import models.Gender;
import models.Pokemon;

public class PokemonManager {

	private List<Pokemon> pokemons = new ArrayList<>();
	
	public PokemonManager() {
		loadDefaultPokemons();
	}
	
	private void loadDefaultPokemons() {
		pokemons.add(new Pokemon(1, "Bulbasur", "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.", "Semilla", "Espesura", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png", 0.7F, 6.9F, Gender.MACHO));
		pokemons.add(new Pokemon(2, "Ivysaur", "Cuando le crece bastante el bulbo del lomo, pierde la capacidad de erguirse sobre las patas traseras.", "Semilla", "Espesura", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png", 1.0F, 13.0F, Gender.MACHO));
		pokemons.add(new Pokemon(3, "Venusaur", "La planta florece cuando absorbe energía solar, lo cual le obliga a buscar siempre la luz del sol.", "Semilla", "Espesura", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png", 2.0F, 100.0F, Gender.MACHO));
		pokemons.add(new Pokemon(4, "Charmander", "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola.", "Fuego", "Lagartija", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png", 2.0F, 100.0F, Gender.MACHO));
	}
	
	public void addPokemon(Pokemon pokemon) {
		pokemons.add(pokemon);
	}
	
	// Getters & Setters
	public List<Pokemon> getPokemons() {
		return this.pokemons;
	}
}
