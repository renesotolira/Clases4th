package com.example.moviles.persistencia

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class Preferencias(private val contexto: Context) {

    companion object{
        //crear el fichero seudo equivalente a cookies
        val Context.dataStore: DataStore<Preferences>
        by preferencesDataStore("configuraciones")
        val AGE = intPreferencesKey("age")//45
        val NAME = stringPreferencesKey("name")
        val HASPET = booleanPreferencesKey("hasPet")
    }
    //modo lectura de la info
    val age: Flow<Int> = contexto.dataStore.data.map { preferences ->
        preferences[AGE] ?: 0
    }
    val name: Flow<String> = contexto.dataStore.data.map { preferences ->
        preferences[NAME] ?: "Sin nombre asignado."
    }
    val hasPet: Flow<Boolean> = contexto.dataStore.data.map { preferences ->
        preferences[HASPET] ?: false
    }



}