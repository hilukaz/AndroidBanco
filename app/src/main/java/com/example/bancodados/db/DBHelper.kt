package com.example.bancodados.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context, factory: SQLiteDatabase.CursorFactory?):
SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION)    {
    companion object{
        private val DATABASE_NAME="appSQL"
        private val  DATABASE_VERSION=1
        val TABLE_NAME="CadastroPessoa"
        val TO_COL="id"
        val NOME_COL="nome"
        val ENDERECO_COL="endereco"
        val BAIRRO_COL="bairro"
        val CEP_COL="cep"

    }
}