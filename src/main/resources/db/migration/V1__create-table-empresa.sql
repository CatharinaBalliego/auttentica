CREATE TABLE empresa_tb (
    empresa_id uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    imagem_logo TEXT NOT NULL,
    instagram VARCHAR(31),
    site TEXT,
    data_cadastro DATE NOT NULL DEFAULT CURRENT_DATE
);

