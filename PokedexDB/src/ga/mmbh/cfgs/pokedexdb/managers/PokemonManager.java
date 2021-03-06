package ga.mmbh.cfgs.pokedexdb.managers;

import java.util.ArrayList;
import java.util.List;

import ga.mmbh.cfgs.pokedexdb.dao.PokemonDAO;
import ga.mmbh.cfgs.pokedexdb.models.Gender;
import ga.mmbh.cfgs.pokedexdb.models.Pokemon;

public class PokemonManager {

	private final PokemonDAO pokemonDAO;
	private final List<Pokemon> pokemons;
	
	public PokemonManager() {
		this.pokemonDAO = new PokemonDAO();
		this.pokemons = pokemonDAO.isConnected() ? pokemonDAO.getAllFromDatabase() : new ArrayList<>();
	}
	
	public boolean isConnected() {
		return pokemonDAO.isConnected();
	}
	
	public void addPokemon(Pokemon pokemon) {
		pokemons.add(pokemon);
	}
	
	public void savePokemons() {	
		List<String[]> values = new ArrayList<>();
		
		for (Pokemon pokemon : pokemons) {
			String id = pokemon.getId() + "";
			String name = "'" + pokemon.getName() + "'";
			String description = "'" + pokemon.getDescription() + "'";
			String specie = "'" + pokemon.getSpecie() + "'";
			String ability = "'" + pokemon.getAbility() + "'";
			String imageURL = "'" + pokemon.getImageURL() + "'";
			String height = pokemon.getHeight() + "";
			String weight = pokemon.getWeight() + "";
			String gender = pokemon.getGender() == Gender.MACHO ? "0" : "1";
			String[] valuesArray = new String[] {id, name, description, specie, ability, imageURL, height, weight, gender};
			values.add(valuesArray);
		}
		
		pokemonDAO.delete("DELETE FROM " + pokemonDAO.getTable());
		pokemonDAO.insert("pokemon_id, name, description, specie, ability, image_url, height, weight, gender", values);
	}
	
	// Getters & Setters
	public List<Pokemon> getPokemons() {
		return this.pokemons;
	}
}
