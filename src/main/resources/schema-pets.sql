CREATE TABLE Species (
    species_id identity,
    name varchar(50) not null
);

CREATE TABLE Pet (
    pet_id identity ,
    name varchar(50) not null,
    pet_species_id int
);

ALTER TABLE Pet
add foreign key (pet_species_id) references Species(species_id);